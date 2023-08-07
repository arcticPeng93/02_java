package java_study.chapter05;

public class ArratEx2 {

	public static void main(String[] args) {
		int[] score = new int[1000];
		System.out.println(score);
		// int변수 1000개가 모두 이름이 score
		// score를 인덱스(위치값)로 구분
		// 첫 번째 score의 index는 0 => score[0]
		// 마지막 score의 index는 전체개수-1 => score[999]
		// 기본형 변수: 기본형 데이터만 저장된 변수
		// => 기본형 변수는 변수 안에 해당 타입의 "값"이 저장

		score[0] = 100;
		score[10] = 200;
		score[999] = 1000;
		// score[1000]은 존재하지 않음.
		System.out.println("첫번째 값: " + score[0]);
		System.out.println("11번째 값: " + score[10]);
		System.out.println("마지막 값: " + score[999]);
		System.out.println("500번째 값: " + score[499]);

		for (int i = 0; i < score.length; i++) {
			System.out.println(i + ": " + score[i]);
		}

	}

}
