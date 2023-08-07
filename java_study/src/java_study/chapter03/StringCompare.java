package java_study.chapter03;

public class StringCompare {

	public static void main(String[] args) {
		//
//		String str1 = "안녕하세요.";
//		String str2 = "안녕하세요.";

		String str1 = new String("안녕하세요.");
		String str2 = new String("안녕하세요.");

		System.out.println(str1);
		System.out.println(str2);

		if (str1 == str2) { // 참조형 변수이므로 heap 주소가 달라 문자열이 다르다고 함
			System.out.println("두 문자열은 같습니다.");
		} else {
			System.out.println("두 문자열은 다릅니다!!");
		}
		if (str1.equals(str2)) { // 내용검사
			System.out.println("두 문자열은 같습니다.");
		} else {
			System.out.println("두 문자열은 다릅니다!!");
		}
// == : js => 내용검사
//		java => 참조값(주소값) 검사
//		내용의 동등성 => equals() 메서드로 판정
	}

}
