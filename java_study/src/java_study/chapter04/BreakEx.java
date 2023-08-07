package java_study.chapter04;

public class BreakEx {

	public static void main(String[] args) throws Exception {
		while (true) {
			// Math.random()은 0<= ~ <1의 실수
			// (int)로 타입캐스팅 해줘 아랫줄에서 나올 수 있는 값은 1,2,3,4,5,6중 하나
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			if (num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
