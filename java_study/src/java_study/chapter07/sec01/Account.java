package java_study.chapter07.sec01;

public class Account {

	private String name;
	private String accountName;
	private int balance;

	public Account() {

	}

	public Account(String n, String an, int b) {
		name = n;
		accountName = an;
		balance = b;
	}

	public void deposit(int amount) { // amount : 입금액
		balance += amount;
		System.out.printf("%s 이 %d원을 입금하다. \n", name, amount);
	}

	public void withdraw(int amount) {
		if (balance < amount) {
			System.out.println("잔액이 부족합니다");
		} else {
			balance -= amount;
			System.out.printf("%s이 희망적금에서 %d원을 출금하다. \n", name, amount);
		}
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", accountName=" + accountName + ", balance=" + balance + "]";
	}

}