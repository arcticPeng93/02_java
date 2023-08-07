package java_study.chapter03;

import javax.swing.JOptionPane;

public class StringComapare2 {
	public static void main(String[] args) {

		String newId = "root";
		String newPw = "pass";

		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("패스워드 입력");
		// String은 부품(class)

		if (newId.equals(id) && newPw.equals(pw)) {
			// 두 조건이 모두 true일 때
			System.out.println("로그인 성공");
		} else {
			System.out.println("아이디나 비밀번호가 일치하지 않습니다.");
		}
	}
}
