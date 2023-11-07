package java_study.chapter17.echo4;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {

	public static void main(String[] args) {
		Socket socket = null;
		// 서버 소켓 생성
		try (ServerSocket serverSocket = new ServerSocket(10000);) {
			System.out.println("서버 기동됨");
			System.out.println("클라이언트 접속 대기중");
			while (true) {
				socket = serverSocket.accept(); // 접속 대기
				System.out.println("클라이언트 접속 성공");

				// 스레드에 일임
				Thread t = new WorkThread(socket);
				t.start();

			}
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
