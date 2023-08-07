package java_study.chapter04;

import java.util.Date;

public class CaseBreakEx1 {

	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth() + 1;
		int day = date.getDay(); // 요일도 0(일요일)부터 시작

		System.out.println(day);
		switch (day) {
		case 0:
		case 6:// ==로 판정하기 때문에 구간검사가 아니다
			System.out.println("자바공부할시간");
			break;

		default:
			break;
		}

	}

}
