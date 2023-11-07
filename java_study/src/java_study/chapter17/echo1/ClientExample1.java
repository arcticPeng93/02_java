package java_study.chapter17.echo1;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample1 {

	public static void main(String[] args) {
		try (Socket socket = new Socket("127.0.0.1", 10000)) {
			System.out.println("서버 연결 성공");
			InputStream in = socket.getInputStream(); // 수신(입력) 스트림
			OutputStream out = socket.getOutputStream(); // 전송(출력) 스트림

			String str = "Hello, Server";
			out.write(str.getBytes()); // 메시지 전송
			out.flush(); // <---flush해줘야 실제로 전송됨!!!
			System.out.println("메시지 전송: " + str);

			byte arr[] = new byte[100]; // 수신 버퍼
			int size = in.read(arr); // 메시지 수신
			System.out.print("메시지 수신: ");
			System.out.println(new String(arr, 0, size));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
