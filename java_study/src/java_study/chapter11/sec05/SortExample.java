package java_study.chapter11.sec05;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		int[] scores = { 99, 97, 98, 67, 102, 66 };

		Arrays.sort(scores);

		System.out.println(Arrays.toString(scores));

		String[] names = { "홍길동", "박동수", "김민수" };
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));

		Member[] members = { new Member("홍길동", 10), new Member("조달달", 30), new Member("마루치", 5), };
		Arrays.sort(members);
		System.out.println(Arrays.toString(members));
	}

}
