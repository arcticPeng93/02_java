package java_study.chapter10.sec02;

public class Account {
	private long balance;

	public Account() {
	}

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) throws JanekBooJokException {
		if (balance < money) {
			throw new JanekBooJokException("잔고부족: " + (money - balance) + " 모자람");
		}
		balance -= money;
	}
}
