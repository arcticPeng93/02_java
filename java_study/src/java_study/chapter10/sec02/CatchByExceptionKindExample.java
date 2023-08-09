package java_study.chapter10.sec02;

public class CatchByExceptionKindExample {

	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("실행 매개값의 수가 부족합니다.");
			System.err.println("[실행 방법]");
			System.err.println("java CatchByExceptionKindExample num1 num2");
//		} catch (NumberFormatException e) {
//			System.err.println("숫자로 변환할 수 없습니다.");
		} catch (Exception e) {
			System.err.println("문제가 좀 있네요..");
			System.out.println(e);
			e.printStackTrace();
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}
