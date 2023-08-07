package java_study.chapter07.sec02;

public class Account {
	// 멤버변수는 외부에서 건들지 못하게 프라이빗으로 정의한다.
	private String name;
	private String ssn;
	private int money;

	public Account() {
//디폴트 생성자는 무조건 정의하는 것이 관례
	}

//	public Account(String name, String ssn, int money) {
//		//this를 통해서 멤버변수와 지역변수를 분리.
//		this.name = name;
//		this.ssn = ssn;
//		this.money = money;
//	} 좌상단 Source - Generate Constructor Using Fields에서 자동생성 가능
	public Account(String name, String ssn, int money) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}

//일반 메서드 정의
	// 좌상단 Source 메뉴에서 getter와 setter를 자동으로 추가할 수도 있다!
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

//보통 생성자를 맨앞에, toString은 가장 바닥에 두는 게 관례
	@Override
	public String toString() {
		return "Account [name=" + name + ", ssn=" + ssn + ", money=" + money + "]";
	}

}
