package java_study.chapter17.echo1;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample1 {

	public static void main(String[] args) {

		Socket socket = null;
		// 서버 소켓 생성
		try (ServerSocket serverSocket = new ServerSocket(10000);) {
			System.out.println("서버 기동됨");
			System.out.println("클라이언트 접속 대기중");
			socket = serverSocket.accept(); // 접속 대기
			System.out.println("클라이언트 접속 성공");

			// 수신(입력) 스트림
			InputStream in = socket.getInputStream();
			// 전송(출력) 스트림
			OutputStream out = socket.getOutputStream();

			byte arr[] = new byte[100];
			int size = in.read(arr); // 메시지 수신
			System.out.print("메시지 수신: ");
			System.out.println(new String(arr, 0, size));

			String str = "Hello, Client";
			out.write(str.getBytes()); // 메시지 전송
			out.flush();
			System.out.println("메시지 전송: " + str);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
