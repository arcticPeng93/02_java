package java_study.chapter03;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;

		// score가 90점 초과인지 T/F판단 후 F일시 다시 한 번 80점 초과인지를 판단하는 삼항연산+삼항연산
		// if반복문과 같은 의미를 갖는다.
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');

		System.out.println(score + "점은 " + grade + "등급입니다.");
	}

}
