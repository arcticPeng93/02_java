package java_study.chapter04;

public class MultiplicationTable {

	public static void main(String[] args) {
//		for (int m = 2; m <= 9; m++) {
//			System.out.println("****" + m + "********");
//
//			for (int n = 1; n <= 9; n++) {
//				System.out.printf("%d x %d = %d\n", m, n, (m * n));
//			}
//		}
		for (int y = 0; y <= 4; y++) {
			for (int x = 0; x <= y; x++) {
				System.out.print('*');
			}
			System.out.println();
		}

	}

}
