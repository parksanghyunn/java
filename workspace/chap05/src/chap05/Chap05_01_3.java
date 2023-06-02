package chap05;

class Calculator{
	int result19 = 0;
	
	int add(int num19) {
		result19 += num19;
		return result19;
	}
}
public class Chap05_01_3 {
	public static void main(String[] args) {
		Calculator cal19 = new Calculator();
		
		System.out.println(cal19.add(3));
		System.out.println(cal19.add(4));
	}
}
