package java_study.chapter05;

public class ArrayEx9 {

	public static void main(String[] args) {
		int[] save = new int[5];

		ArrayUtil.getNumbers("숫자 입력 >> ", save);

		int maxIx = ArrayUtil.findMax(save);
		int minIx = ArrayUtil.findMin(save, 1, 2);

//		int max = save[0];
//		int min = save[0];
//		for (int i = 0; i < save.length; i++) {
//			if (max < save[i]) {
//				max = save[i];
//			}
//			if (min > save[i]) {
//				min = save[i];
//			}
//		}

		System.out.println("최고 점수는 : " + save[maxIx]);
		System.out.println("최저 점수는 : " + save[minIx]);
	}

}
