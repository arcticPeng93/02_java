package java_study.chapter05;

public class ArrayEx8 {

//	static void getNumbers(int[] data) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("점수: ");
//		for (int i = 0; i < data.length; i++) {
//			data[i] = sc.nextInt();
//		}
//	} 위에 붙여넣을 필요 없이 동일 패키지 내에서 클래스.메소드명 으로 호출함

	public static void main(String[] args) {
		int[] jumsu = new int[5];

		ArrayUtil.getNumbers("점수 >> ", jumsu);
		ArrayUtil.showNumbers(jumsu);
		int sum = ArrayUtil.addAll(jumsu);

		System.out.println("전체 합계: " + sum);
		double avg = (double) sum / jumsu.length;
		System.out.println("전체 평균: " + avg);

	}

}
