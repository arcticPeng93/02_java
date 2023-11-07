package org.galapagos.common.cli;

import java.util.Scanner;

public class Input {
	static Scanner sc = new Scanner(System.in);

	// Facade Pattern
	public static String read(String title) {
		System.out.print(title);
		return sc.nextLine();
	}

	public static String read(String title, String defaultValue) {
		System.out.printf("%s(%s): ", title, defaultValue);
		String answer = sc.nextLine();

		// 그냥 엔터만 쳤으면 defaultValue 리턴, 입력값이 있으면 answer 리턴
		return answer.isEmpty() ? defaultValue : answer;
	}

	public static int readInt(String title) {
		System.out.print(title);
		int answer = sc.nextInt();
		sc.nextLine(); // 버퍼에서 엔터 제거용
		return answer;
	}

	// 오버라이드로 Yes가 default일 경우를 생성
	public static boolean confirm(String title) {
		return confirm(title, true);
	}

	public static boolean confirm(String title, boolean defaultValue) {
		String yesNo = defaultValue ? "(Y/n)" : "(y/N)";

		System.out.printf("%s %s: ", title, yesNo);

		String answer = sc.nextLine();
		if (answer.isEmpty()) {
			return defaultValue;
		}
		return answer.equalsIgnoreCase("y");
//		if (answer.equalsIgnoreCase("y")) {
//			return true;
//		}	else	{
//			return false;
//		}

	}

}
