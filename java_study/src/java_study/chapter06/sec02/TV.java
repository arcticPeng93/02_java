package java_study.chapter06.sec02;

public class TV {

	//

	public int ch;
	public int vol;
	public boolean onOff;

	public void channelSwitch() {
		int change = 1;
		System.out.println(ch + change + "번호로 바꾸다.");
	}

	public void volumeControl() {
		System.out.println(vol + "을 키워서 동영상을 보다.");
	}

}
