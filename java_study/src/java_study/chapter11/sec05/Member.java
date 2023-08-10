package java_study.chapter11.sec05;

public class Member implements Comparable<Member> {
	String name;
	int age;

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Member o) {
		// return name.compareTo(o.name);
		return age - o.age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}

}
