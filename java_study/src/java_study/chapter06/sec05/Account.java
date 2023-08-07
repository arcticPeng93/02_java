package java_study.chapter06.sec05;

public class Account {

	String name;
	String accountName;
	int balance;

	public void deposit() {
		System.out.printf("%s이 %d원을 입금하다.\n", name, balance);

	}

	public void withdraw() {
		System.out.printf("%s이 %s에서 출금하다.\n", name, accountName);
	}

}
