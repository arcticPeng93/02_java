package java_study.chapter06.sec02;

import java_study.chapter06.sec02.TV;

public class MyRoom {

	public static void main(String[] args) {
		TV t1 = new TV();
		t1.onOff = true;
		t1.ch = 20;
		t1.vol = 200;

		System.out.println(t1);

		TV t2 = new TV();
		t2.onOff = true;
		t2.ch = 42;
		t2.vol = 20;

		System.out.println(t2);

	}

}
