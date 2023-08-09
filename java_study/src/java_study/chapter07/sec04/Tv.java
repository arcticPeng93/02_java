package java_study.chapter07.sec04;

public class Tv {
	private int channel;
	private int volume;
	private boolean onOff;

	static int count = 0;

	public Tv() {
		count++;
	}

	public Tv(int channel, int volume, boolean onOff) {
		super();

		count++;
		this.channel = channel;
		this.volume = volume;
		this.onOff = onOff;

	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isOnOff() {
		return onOff;
	}

	@Override
	public String toString() {
		return "Tv [channel=" + channel + ", volume=" + volume + ", onOff=" + onOff + "]";
	}

}
