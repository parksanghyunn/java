package chap05;

class Calculator1{
	static int result19 = 0;
	
	static int add(int num19) {
		result19 += num19;
		return result19;
	}
}

class Calculator2{
	static int result19 = 0;
	
	static int add(int num19) {
		result19 += num19;
		return result19;
	}
}
public class Chap05_01_2 {
	public static void main(String[] args) {
		System.out.println(Calculator1.add(3));
		System.out.println(Calculator1.add(4));

		System.out.println(Calculator2.add(3));
		System.out.println(Calculator2.add(7));
	}
}
