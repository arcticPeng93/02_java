package java_study.chapter16.sec02;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) throws Exception {
		File file = new File("C:/Temp/file.txt");
		FileWriter fw = new FileWriter(file, true); // true이기 때문에 기존 txt파일이 있다면 뒤에 이어서 작성
		fw.write("FileWriter는 한글로된 " + "\r\n");
		fw.write("문자열을 바로 출력할 수 있다." + "\r\n");
		fw.flush();
		fw.close();
		System.out.println("파일에 저장되었습니다.");
	}
}
