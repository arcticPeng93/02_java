package org.galapagos.mcmorning.dao;

import java.util.ArrayList;
import java.util.List;

import org.galapagos.mcmorning.vo.Member;

import lombok.Getter;

public class MemberDao {
	@Getter
	private List<Member> memberList;

	public MemberDao() {
		memberList = new ArrayList<Member>();
		memberList.add(new Member("kim", "1234", "김길동", "kim@naver.com"));
		memberList.add(new Member("lee", "1234", "이길동", "lee@naver.com"));
		memberList.add(new Member("park", "1234", "박길동", "park@naver.com"));
		memberList.add(new Member("son", "1234", "손길동", "son@naver.com"));
	}

	// 추가
	public void add(Member m) {
		memberList.add(m);
	}

	// userid로 검색
	public Member findByUserid(String userid) {
//		for (Member m : memberList) {
//			if (userid.equals(m.getUserid())) {
//				return m;
//			}
//		}
		int ix = indexOf(userid);
		return ix != -1 ? memberList.get(ix) : null;
	}

	// 수정
	public Member update(Member m) {
//		for (int i = 0; i < memberList.size(); i++) {
//			if (m.getUserid().equals(memberList.get(i).getUserid())) {
//				memberList.set(i, m);
//				return m;
//			}
//		}
		int ix = indexOf(m.getUserid());
		if (ix != -1) {
			memberList.set(ix, m);
			return m;
		}
		return null;
	}

	// 찾아서 인덱스명을 리턴해주는 메소드
	private int indexOf(String userid) {
		for (int i = 0; i < memberList.size(); i++) {
			if (userid.equals(memberList.get(i).getUserid())) {
				return i;
			}
		}
		return -1; // 인덱스로 쓸 수 없는 숫자인 -1을 리턴
	}

	// 삭제
	public Member delete(String userid) {
		int ix = indexOf(userid);

		if (ix != -1) {
			return memberList.remove(ix);
		}
		return null;

		// return ix != -1 ? memberList.remove(ix) : null
	}

}
