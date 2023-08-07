package java_study.chapter02;

public class BasicData2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte age = 100; // ~128~127
		short wallet = 20000; // -3만~3만
		int money = 5000000; // -21억~21억
		long space = 1000000000000L; // 21억 이상
		System.out.println("내 은행에 든 돈: " + money + "원");

		// 실수 => double
		double height = 185.5;
		float weight = 88.8f;
		System.out.println("내 키는: " + height);

		// 문자 => 1글자
		char gender = '남';
		System.out.println("내 성별은 " + gender);

		// 기본데이터는X
		// 일상 생활에서 문자를 많이 사용하기에 이 부품을 기본데이터로 쓸 수 있게 만들어둠
		// char+char+char
		String name = "홍길동";
		System.out.println("내 이름은: " + name);

		System.out.println("줄을\t 바꾸고 싶어요. \n 다음줄에 \"나와요.\"	");
	}

}
