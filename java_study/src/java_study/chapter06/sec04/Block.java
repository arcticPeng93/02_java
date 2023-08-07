package java_study.chapter06.sec04;

public class Block {
	// 멤버변수
	int x = 10;
	int y = 20;
	String color = null;

	// 멤버 메서드
	public void put() {
		int move = 50;
		System.out.println(move + "만큼 벽돌을 쌓다.");
	}

	// 상단 Source메뉴나 마우스 우클릭-toString만들기로 자동생성 가능!!!
	@Override
	public String toString() {
		return "Block [x=" + x + ", y=" + y + ", color=" + color + "]";
	}

//	public String toString() {
//		return "Block [x=" + x + ", y=" + y + ", color=" + color + "]";
//	}

}
