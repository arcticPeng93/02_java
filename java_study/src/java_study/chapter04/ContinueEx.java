package java_study.chapter04;

public class ContinueEx {

	public static void main(String[] args) throws Exception {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) { // i가 홀수일 때는 6라인으로 돌아간다
				continue;
			}
			System.out.println(i);
		}

	}

}
