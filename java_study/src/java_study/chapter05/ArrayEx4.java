package java_study.chapter05;

public class ArrayEx4 {

	public static void main(String[] args) {
		String str = new String("Hello");

		str = new String("World");

		String str2 = new String("World");
		str = str2;

		str = null;

	}

}
