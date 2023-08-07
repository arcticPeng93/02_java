package java_study.chapter06.sec05;

public class AccountUse {

	public static void main(String[] args) {
		Account account1 = new Account();
		account1.name = "홍길동";
		account1.accountName = "희망적금";

		account1.deposit(5000);
		account1.deposit(15000);

		account1.withdraw(200000);
		account1.withdraw(20000);

		System.out.println(account1);
	}

}
