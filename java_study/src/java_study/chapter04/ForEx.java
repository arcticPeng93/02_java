package java_study.chapter04;

public class ForEx {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) { // %2 했을 때 값이 0이면 짝수, 1이면 홀수이다.
				sum += i; // sum = sum + i;
			}
		}
		System.out.println("1~100까지의 짝수의 합 : " + sum);
	}

}
