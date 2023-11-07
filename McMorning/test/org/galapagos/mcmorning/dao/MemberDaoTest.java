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
		MemberDao dao = new MemberListDao();
		List<Member> list = dao.getMemberList();

		for (Member m : list) {
			System.out.println(m);
		}
	}

	static void testAdd() {
		MemberDao dao = new MemberListDao();
		List<Member> list = dao.getMemberList();

		int l = list.size();
		Member m2 = new Member("dooli", "1234", "둘리", "dooli@gmail.com");
		dao.add(m2);

		// 단정문 VM 매개변수로 -ea ==> java -ea MemberDaoTest
		assert list.size() == l + 1 : "추가실패";
	}

	static void testFindByUserid() {
		MemberDao dao = new MemberListDao();

		String userid = "hong";
		Member m = dao.findByUserid(userid);
		assert m != null && userid.equals(m.getUserid()) : userid + " 검색 실패";

		userid = "donut";
		m = dao.findByUserid(userid);
		assert m == null : userid + " 검색 실패";

	}

	static void testUpdate() {
		MemberDao dao = new MemberListDao();

		Member m = new Member("na", "1234", "나길동", "na@gmail.com");
		Member m2 = dao.update(m);
		assert m2 != null && m == m2 : "업데이트 실패";

		m = dao.findByUserid("hong");
		m.setEmail("hong@gmail.com");
		m2 = dao.update(m);
		assert m2 != null && m == m2 : "업데이트 실패";

	}

	static void testDelete() {
		MemberDao dao = new MemberListDao();
		Member m = dao.delete("na");

		assert m != null && m.getUserid().equals("na") : "삭제 실패";
	}

}
