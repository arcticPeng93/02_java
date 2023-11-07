package java_study.chapter17.echo3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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

				BufferedReader r = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter w = new PrintWriter(socket.getOutputStream());

				// 메시지 수신
				String line = r.readLine();
				System.out.println("서버 수신 메시지 : " + line);

				// 메시지 전송
				w.println(line);
				w.flush();

				socket.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (Exception e) {
			}
		}

	}

}
