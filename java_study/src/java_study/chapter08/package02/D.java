package java_study.chapter08.package02;

import java_study.chapter08.package01.A;

public class D extends A {
// 클래스 A와 상속관계이기 때문에 접근을 허용
	public D() {
		super(); // (O)
		this.field = "value"; // (O)
		this.method(); // (O)
	}
}
