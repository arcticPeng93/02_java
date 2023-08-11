package java_study.chapter13.sec01;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동", "신용권", "감자바"); // 읽기 전용

		list1.set(0, "고길동");
		list1.remove(0);
		list1.add("고길동");

		for (String name : list1) {
			System.out.println(name);
		}
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for (int value : list2) {
			System.out.println(value);
		}

	}

}
