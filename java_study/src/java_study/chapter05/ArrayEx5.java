package java_study.chapter05;

import javax.swing.JOptionPane;

public class ArrayEx5 {

	public static void main(String[] args) {
		// 입력을 여러개 받아서 저장공간에 넣고 싶을 때 => 배열을 사용!
		// 배열을 만들기
		int[] jumsu = new int[5];

		// 배열에 값을 넣을 때는 index가 필요 => i가 있는 for문을 사용해야 함.
		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("숫자 입력");
			// 숫자로 변환한 값을 배열의 해당 인덱스에 값으로 넣기
			jumsu[i] = Integer.parseInt(data);
		}
		for (int x : jumsu) {
			System.out.print(x + " ");
		}
		System.out.println();

		// 전체합을 구하여 평균 도출하기.
		int sum = 0;
		for (int x : jumsu) {
			sum = sum + x;
		}
		System.out.println("전체합계: " + sum);
		// 합계를 배열의 인덱스로 나눠서 평균도출
		double avg = (double) sum / jumsu.length;
		System.out.println("전체평균: " + avg);

		// 300이상되는 숫자만 찾아서 합계 구하기.
		int sum2 = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				sum2 = sum2 + jumsu[i];
			}
		}
		System.out.println("300이상 되는 값 합계: " + sum2);

		// 심화, 300이상되는 위치의 index를 프린트
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				System.out.println("300이상 되는 값의 index: " + i);
			}
		}
	}

}
