package java_study.chapter08.package02;

import java_study.chapter08.package01.A;

public class C {
	// protected는 자식 클래스가 아닌 다른 패키지에선 접근이 안된다(not visible에러메시지)
	public void method() {
//		A a = new A(); // (X)
//		a.field = "value"; // (X)
//		a.method(); // (X)
	}
}
