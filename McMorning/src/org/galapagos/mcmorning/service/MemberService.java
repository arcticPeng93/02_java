package org.galapagos.mcmorning.service;

import org.galapagos.mcmorning.cli.Input;
import org.galapagos.mcmorning.dao.MemberDao;
import org.galapagos.mcmorning.exeption.UseridCountOverException;
import org.galapagos.mcmorning.vo.Member;

public class MemberService {
	MemberDao dao = new MemberDao();

	public void signup() {
		// Member 정보 입력
		// id 중복 체크
		// Member 인스턴스 생성
		// 리스트 넣기(Dao)

		Member member;
		try { // 예외처리
			member = inputMember();
			dao.add(member);
		} catch (UseridCountOverException e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}

	}

	public Member inputMember() throws UseridCountOverException {

		// Facade Pattern
		String userid = inputUserid(); // 에러를 받았을 때 다시 상위로 던져줘야 한다.
		String password = Input.read("비밀번호 : ");
		String name = Input.read("이름 : ");
		String email = Input.read("이메일 : ");

		Member member = new Member(userid, password, name, email);

		return member;
	}

	public String inputUserid() throws UseridCountOverException {
		String userid = "";
		for (int i = 0; i < 3; i++) {
			userid = Input.read("사용자ID : ");
			Member m = dao.findByUserid(userid);

			if (m != null) { // 중복이면(userid로 탐색하여 나온 것이 있으면)
				System.out.println(userid + "는 중복된 ID입니다.");
			} else {
				return userid;
			}
		}
		throw new UseridCountOverException();

	}
}
