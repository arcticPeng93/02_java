package java_study.chapter07.sec03;

public class ComputerMake {

	public static void main(String[] args) {
		Computer c1 = new Computer(200, "삼보", "32인치");
		System.out.println(c1);

		Computer c2 = new Computer(100, "삼성", "21인치");
		System.out.println(c2);

		Computer c3 = new Computer();
		c3.setPrice(3000);
		c3.setMaker("파인애플");
		c3.setMoniterSize("60인치");

		System.out.println(c3);
	}

}
