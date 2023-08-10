package java_study.chapter11.sec04;

import java.util.Scanner;

public class StringWithExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("파일명: ");
		String fileName = sc.nextLine();
		String test = fileName.toLowerCase(); // 입력이 Mp3일지 MP3일지 mp3일지 알 수 없으니 소문자로 통일

		if (test.endsWith(".mp3")) {
			System.out.println("mp3 파일입니다.");
		} else {
			System.out.println("mp3파일이 아닙니다.");
		}

		boolean b1 = fileName.endsWith("mp3");
		boolean b2 = fileName.startsWith("a");
		boolean b3 = fileName.startsWith("bc");

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

	}

}
