package java_study.chapter04;

import java.util.Random;
import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int computer = r.nextInt(3); // 3은 미포함 0,1,2중에 랜덤으로 정함
		System.out.println("0:가위 1:바위 2:보 >> ");
		int me = sc.nextInt();

		System.out.printf("컴퓨터 : %d, 나 : %d", computer, me);

		if (me == computer) {
			System.out.println("비겼습니다.");
		} else if ((me == 0 && computer == 2) || (me == 1 && computer == 0) || (me == 2 && computer == 1)) { // 내가 이긴경우
			System.out.println("내가 이겼습니다.");
		} else {
			System.out.println("컴퓨터가 이겼습니다.");
		}
		{

		}

	}

}
