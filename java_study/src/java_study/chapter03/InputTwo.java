package java_study.chapter03;

public class InputTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10;
		int n2 = 4;

		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);

		System.out.println(n1 / n2); // (정수/정수) => 정수(몫)
		// (정수/실수) => 실수
		System.out.println(n1 / 4.0);
		// 캐스팅연산자 ()가 일반 연산자보다 우선순위가 높음
		System.out.println(n1 / (double) n2);

		// 문자열을 int형으로 바꿔주는 함수는 Integer.parseInt(문자열변수);
		// ex) int age = Integer.parseInt(age)

	}

}
