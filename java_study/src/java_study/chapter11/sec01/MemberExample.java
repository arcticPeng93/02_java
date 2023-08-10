package java_study.chapter11.sec01;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue", 10);
		Member obj2 = new Member("blue", 20);
		Member obj3 = new Member("red", 30);

		String obj4 = new String("blue");

		if (obj1.equals(obj2)) {
			System.out.println("1과 2는 동등합니다.");
		} else {
			System.out.println("1과 2는 동등하지 않습니다.");
		}

		if (obj1.equals(obj3)) {
			System.out.println("1과 3은 동등합니다.");
		} else {
			System.out.println("1과 3은 동등하지 않습니다.");
		}

		System.out.println(obj1.equals(obj4));
	}

}
