package java_study.chapter16.sec02;

import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:/temp/test.txt");

		int readCharNo;
		char[] cbuf = new char[100];
		while ((readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.print(data);

//			System.out.print(cbuf);
		}
		fr.close();
	}
}
