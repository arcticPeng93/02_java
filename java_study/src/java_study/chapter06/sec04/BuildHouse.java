package java_study.chapter06.sec04;

public class BuildHouse {

	public static void main(String[] args) {

		// new를 가지고 객체 생성하면 멤버변수들이 복사됨. Block같은 경우엔 3+1개
		Block blk1 = new Block();
		blk1.x = 50;
		blk1.y = 50;
		blk1.color = "회색";

		System.out.println(blk1); // 디버깅 용

		Block blk2 = new Block();
		blk2.x = 100;
		blk2.y = 100;
		blk2.color = "초록색";

		System.out.println(blk2);

		blk1.put();
		blk2.put();
	}

}
