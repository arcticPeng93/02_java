package java_study.chapter05;

public class ArrayEx7 {

	public static void main(String[] args) {
		int[] jumsu = new int[5];

		ArrayUtil.getNumbers("점수 >> ", jumsu); // call by reference
		ArrayUtil.showNumbers(jumsu);
		int sum = ArrayUtil.addAll(jumsu);

		System.out.println("전체 합계: " + sum);
		double avg = (double) sum / jumsu.length;
		System.out.println("전체 평균: " + avg);

	}

}
