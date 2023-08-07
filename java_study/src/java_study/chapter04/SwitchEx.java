package java_study.chapter04;

public class SwitchEx {

	public static void main(String[] args) {
		String name = "자바";

		switch (name) {
		case "자바":
			System.out.println("1103호로 가세요.");
			break;
		case "파이썬":
			System.out.println("1104호로 가세요.");
			break;
		case "OS":
		case "리눅스":
			System.out.println("1105호로 가세요.");
			break;
		default:
			System.out.println("카운터로 가세요.");
			break;
		}

	}

}
