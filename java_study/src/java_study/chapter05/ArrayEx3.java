package java_study.chapter05;

public class ArrayEx3 {

	public static void main(String[] args) {
		// 친구이름
		String[] names = { "홍길동", "김길동", "박길동", "이길동", "최길동" };
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();

		int[] ages = { 50, 40, 30, 20, 10 };
		for (int i = 0; i < ages.length; i++) {
			System.out.print(ages[i] + " ");
		}
		System.out.println();

		int[] shoes = { 230, 140, 260, 220, 110 };
		for (int i = 0; i < shoes.length; i++) {
			System.out.print(shoes[i] + " ");
		}
		System.out.println();

		char[] gender = { '남', '여', '남', '남', '여' };
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < names.length; i++) {
//			System.out.print((i + 1) + ". " + names[i] + " " + ages[i] + " " + shoes[i] + " " + gender[i] + " ");
			System.out.printf("%d %s %d %d %c\n", i + 1, names[i], ages[i], shoes[i], gender[i]);
//			System.out.println();
		}

	}

}
