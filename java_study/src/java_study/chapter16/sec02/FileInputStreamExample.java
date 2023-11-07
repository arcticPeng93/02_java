package java_study.chapter16.sec02;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("C:/temp/test.txt")) {
			int data;
			while ((data = fis.read()) != -1) { // 1byte씩 읽고 콘솔에 출력
//				System.out.write(data);
				System.out.print((char) data);
			}
		} catch (Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
			e.printStackTrace();
		}

//		FileInputStream fis = null;
//		try {
//
//			fis = new FileInputStream("C:/temp/test.txt");
//
//			int data;
//			while ((data = fis.read()) != -1) { // 1byte씩 읽고 콘솔에 출력
//				System.out.write(data);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				System.out.println("파일닫기");
//				if (fis != null) {
//					fis.close();
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
	}
}
