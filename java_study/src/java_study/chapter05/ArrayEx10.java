package java_study.chapter05;

public class ArrayEx10 {

	// 배열의 입력을 받아서 구성
	// 최소값을 찾아서 인덱스 0번과 값을 교환
	public static void main(String[] args) {
//		int[] data = new int[5];

		// 데이터 입력
//		ArrayUtil.getNumbers("숫자 입력 >> ", data);
		int[] data = ArrayUtil.getRandomArray(10, 100);

		for (int i = 0; i < data.length; i++) {
			int minIx = ArrayUtil.findMin(data, i, data.length);
			ArrayUtil.swap(data, i, minIx);
		}

		ArrayUtil.showNumbers(data);

	}

}
