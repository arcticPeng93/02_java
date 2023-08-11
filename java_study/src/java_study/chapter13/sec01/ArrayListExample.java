package java_study.chapter13.sec01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Java");
		list.add("JDBC");
		list.add("Servlet");
		list.add(2, "Database"); // 0->1->2번 칸에 데이터삽입
		list.add("iBATIS");

		System.out.println(list);
		int size = list.size();
		System.out.println("총 객체수: " + size);
		System.out.println();

		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();

		// 순회
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		// 삭제
		System.out.println();
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}

}
