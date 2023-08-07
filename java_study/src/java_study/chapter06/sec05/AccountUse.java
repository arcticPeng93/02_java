package java_study.chapter06.sec05;

public class AccountUse {

	public static void main(String[] args) {
		Account dad = new Account();
		dad.name = "홍길동";
		dad.accountName = "곳간";
		dad.balance = 200000;

		dad.deposit();
		dad.withdraw();

	}

}
