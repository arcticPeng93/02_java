package java_study.chapter07.sec03;

public class Computer {

	private int price;
	private String maker;
	private String moniterSize;

	public Computer() {
	}

	public Computer(int price, String maker, String moniterSize) {
		super();
		this.price = price;
		this.maker = maker;
		this.moniterSize = moniterSize;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getMoniterSize() {
		return moniterSize;
	}

	public void setMoniterSize(String moniterSize) {
		this.moniterSize = moniterSize;
	}

	@Override
	public String toString() {
		return "Computer [price=" + price + ", maker=" + maker + ", moniterSize=" + moniterSize + "]";
	}

}
