package java_study.chapter07.sec02;

public class AccountUse {

	public static void main(String[] args) {
		Account a1 = new Account("홍길동", "990115", 10000);
		System.out.println(a1);

		Account a2 = new Account("고길동", "910115", 100000);
		System.out.println(a2);

//		Account a3 = new Account(); << 에러! 생성자가 존재하므로 기본생성자는 자동추가되지 않음

		// 금액을 변경하고 싶어요
		// 현재 잔액만 출력하고 싶어요
		// private 멤버변수라 직접 접근할 수 없으니 새 메서드로 정의해서 return값을 받는다
		a2.setMoney(200000);
		System.out.println(a2.getMoney());

	}

}
