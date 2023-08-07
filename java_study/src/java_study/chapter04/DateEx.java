package java_study.chapter04;

import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date date = new Date();

		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();

		System.out.printf("%d시 %d분 %d초\n", hour, min, sec);

		int year = date.getYear();
		int month = date.getMonth() + 1; // 월은 0부터 시작
		int today = date.getDate();

		System.out.printf("%4d-%02d-%02d %02d:%02d:%02d\n", year + 1900, month, today, hour, min, sec);
	}
}
