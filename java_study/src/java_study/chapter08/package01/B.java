package java_study.chapter08.package01;

public class B {
	// protect 같은 패키지 안에 있기때문에 접근 가능
	public void method() {
		A a = new A(); // (O)
		a.field = "value"; // (O)
		a.method(); // (O)
	}
}
