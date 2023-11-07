package org.galapagos.mcmorning.service;

import org.galapagos.mcmorning.dao.MemberListDao;
import org.galapagos.mcmorning.dao.MemberMapDao;
import org.galapagos.mcmorning.exception.UseridCountOverException;
import org.galapagos.mcmorning.vo.Member;

public class MemberServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// testInputMember();
//		testLogin();
		testSearchByName();
	}

	static void testSearchByName() {
		MemberService service = new MemberService(new MemberMapDao());
		service.searchByName();
	}

	static void testLogin() {
		MemberService service = new MemberService(new MemberMapDao());
		Member m = service.login();

		System.out.println(m);
		// 로그인 성공시 'xxx님 환영합니다.' 출력
		// 로그인 실패시 에러 메시지 출력
		if (m != null) { // 로그인 성공
			System.out.println(m.getUserid() + "님 환영합니다.");
		} else { // 로그인 실패
			System.out.println("사용자 ID 또는 비밀번호가 올바르지 않습니다.");
		}

	}

	static void testInputMember() {
		// Dependency Injection
//		MemberService service = new MemberService(new MemberMapDao());
		MemberService service = new MemberService(new MemberListDao());

		Member m;
		try {
			m = service.inputMember();
			System.out.println(m);
		} catch (UseridCountOverException e) {
			System.out.println(e.getMessage());
		}

	}
}
