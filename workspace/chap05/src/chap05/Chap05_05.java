package chap05;

class Animal19 {
	String name19;

	void setName(String name19) {
		this.name19 = name19;
	}
}

class Dog extends Animal19 {
	void sleep() {
		System.out.println(this.name19 + "ZZZZ");
	}
}

public class Chap05_05{
	public static void main(String[] args) {
		Dog d19 = new Dog();
		d19.setName("poppy");
		System.out.println(d19.name19);
		d19.sleep();
	}
}
