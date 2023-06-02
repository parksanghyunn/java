package chap05;

public class Chap05_01_1 {
	static int resulrt19 = 0;
	
	static int add(int num19) {
		resulrt19 += num19;
		return resulrt19;
	}
	public static void main(String[] args) {
		System.out.println(add(3));
		System.out.println(add(4));
	}
}
