package java_study.chapter17.http;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleHTTPServer {
	public static void main(String[] args) {
		Socket socket = null;
		// 서버 소켓 생성
		try (ServerSocket serverSocket = new ServerSocket(80);) {
			System.out.println("서버 기동됨");
			System.out.println("클라이언트 접속 대기중");
			while (true) {
				socket = serverSocket.accept(); // 접속 대기
				System.out.println("클라이언트 접속 성공");

				BufferedReader r = new BufferedReader(new InputStreamReader(socket.getInputStream()));

				// 1. 요청 라인
				String line = r.readLine();
				System.out.println(line);

				// 2. 요청 헤더(key:value)
				while (true) {
					line = r.readLine();
					if (line.equals("")) { // 헤더의 끝
						break;
					}
					System.out.println(line);
				}

				// 스레드에 일임
//				Thread t = new WorkThread(socket);
//				t.start();

			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
