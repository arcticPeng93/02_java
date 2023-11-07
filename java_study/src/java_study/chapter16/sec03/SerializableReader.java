package java_study.chapter16.sec03;

public class SerializableReader {
	public static void main(String[] args) throws Exception {

		try {
			ClassA v = (ClassA) Serializer.load("c://temp/object2.dat"); // Object --> ClassA 변환(다운캐스팅)

			System.out.println("field1: " + v.field1);
			System.out.println("field2.field1: " + v.field2.field1);
			System.out.println("field3: " + v.field3);
			System.out.println("field4: " + v.field4);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
