package org.galapagos.mcmorning.dao;

import java.util.List;

import org.galapagos.mcmorning.vo.Member;

public class MemberDaoTest {
	public static void main(String[] args) {
		testRead();
		testAdd();
		testFindByUserid();
		testUpdate();
		testDelete();

	}

	static void testRead() {
		MemberDao dao = new MemberDao();
		List<Member> list = dao.getMemberList();

		for (Member m : list) {
			System.out.println(m);
		}
		System.out.println();
	}

	static void testAdd() {
		MemberDao dao = new MemberDao();
		List<Member> list = dao.getMemberList();

		int l = list.size();

		Member m2 = new Member("dooli", "1234", "둘리", "dooli@naver.com");
		dao.add(m2);

//		for (Member m : list) {
//			System.out.println(m);
//		}

//		if (list.size() != l+1) {
//			System.out.println("추가 실패.");
//		}

		// 단정문. 검사결과가 true면 통과, false면 예외 발생
		// 단정문 VM 매개변수로 -ea ==> java -em MemberDaoTest
		assert list.size() == l + 1 : "추가실패";
	}

	static void testFindByUserid() {
		MemberDao dao = new MemberDao();

		String userid = "park";
		Member m = dao.findByUserid(userid);
		assert m != null && userid.equals(m.getUserid()) : userid + " 검색 실패";

		userid = "donut"; // 없는 정보를 검색해서 null(검색 실패함)을 유도하기
		m = dao.findByUserid(userid);
		assert m == null : userid + "검색 실패.";

	}

	static void testUpdate() {
		MemberDao dao = new MemberDao();

		Member m = new Member("lee", "1234", "이길동", "lee@gmail.com");
		Member m2 = dao.update(m);
		assert m2 != null && m == m2 : "업데이트 실패";

		m = dao.findByUserid("kim");
		m.setEmail("kim@gmail.com");
		m2 = dao.update(m);
		assert m2 != null && m == m2 : "업데이트 실패";
	}

	static void testDelete() {
		MemberDao dao = new MemberDao();
		Member m = dao.delete("son");

		assert m != null && m.getUserid().equals("son") : "삭제 실패";
	}
}
