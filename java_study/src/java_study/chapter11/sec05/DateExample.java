package java_study.chapter11.sec05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);

		// 웹개발 중 자주 쓰는 클래스 SimpleDateFormat 자주 쓰니까 기억하기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");

		String strNow2 = sdf.format(now);
		System.out.println(strNow2);

	}

}
