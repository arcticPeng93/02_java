package java_study.chapter11.sec04;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567 ";

		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);

		String secondNum = ssn.substring(7);
		System.out.println(secondNum);

		// 파일이름을 모른다고 가정하고, 파일의 확장명 추출하기
		String fileName = "Hello.World.mp3";
		int lIx = fileName.lastIndexOf('.'); // 뒤에서부터 .의 위치 찾기
		if (lIx != -1) {
			String extension = fileName.substring(lIx + 1);
			System.out.println(extension);
		}

		// 확장자를 제외한 파일명만 추출하기
		// String fileName = "Hello.World.mp3";
		int ix = fileName.lastIndexOf('.');
		if (ix != -1) {
			String extension = fileName.substring(0, ix);
			System.out.println(extension);
		}
	}
}
