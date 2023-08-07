package java_study.chapter05;

public class CallByReferenceEx {

	public static void main(String[] args) {
		int[] data = { 100, 200 };

		swap(data);
		System.out.printf("%d %d\n", data[0], data[1]);

	}

	// 배열의 첫번째, 두번째 엘리먼트 교환
	static void swap(int[] data) {
		int temp = data[0];
		data[0] = data[1];
		data[1] = temp;
		System.out.printf("swapped %d %d\n", data[0], data[1]);
	}

}
