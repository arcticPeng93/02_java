package java_study.chapter07.sec04;

public class MyRoom {

	public static void main(String[] args) {
		System.out.println(Tv.count);
		Tv myTv = new Tv(70, 9, true);
		Tv yourTv = new Tv(90, 12, true);

		System.out.println(myTv);
		System.out.println(yourTv);

		Tv[] tvArr = new Tv[100];
		for (int i = 0; i < 100; i++) {
			Tv tv = new Tv(1, 1, true);
			tvArr[i] = tv;
			// tvArr[i] = new Tv(1, 1, true); 와 같다
		}

		System.out.println(myTv.getChannel());
		System.out.println(yourTv.getChannel());
		System.out.println(tvArr[0]);
		System.out.println(Tv.count);
	}

}
