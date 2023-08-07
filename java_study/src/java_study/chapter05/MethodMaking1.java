package java_study.chapter05;

public class MethodMaking1 {

	public static void main(String[] args) {
		printCharacter('*', 30);
		System.out.println("Hello, Java");
		printCharacter('-', 30);

		for (int i = 1; i <= 5; i++) {
			printCharacter('*', i);
		}

		for (int i = 5; i > 0; i--) {
			printCharacter('*', i);
		}
	}

	// printCharacter 메소드 작성
	static void printCharacter(char ch, int num) {
		for (int cnt = 0; cnt < num; cnt++) {
			System.out.print(ch);
		}
		System.out.println();
	}

}
