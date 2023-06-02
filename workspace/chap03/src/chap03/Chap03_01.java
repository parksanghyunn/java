package chap03;

public class Chap03_01 {
	public static void main(String[] args) {
		//정수
		int age19 = 10;	//기본
		long countOfStar19 = 8764827384923849L;
		
		//실수
		float pi19 = 3.14F;
		double morePi19 = 3.14159265368979323846;	//기본
		
		double d1 = 123.4;
		double d2 = 123e2; //e2 = 10의 제곱
		
		//8진수
		int octal = 023;	//10진수: 19
		
		//16진수
		int hex = 0xc;		//10진수 : 12
		
		//숫자연산
		int a19 = 10;
		int b19 = 5;
		
		System.out.println(a19+b19);
		System.out.println(a19-b19);
		System.out.println(a19*b19);
		System.out.println(a19/b19);
		
		System.out.println(7 % 3);
		System.out.println(3 % 7);
		
		//증감연산
		int i19 = 0;
		int j19 = 10;
		i19++;
		j19--;
		
		System.out.println(i19);
		System.out.println(j19);
		
		System.out.println(i19++); //1출력
		System.out.println(i19);	//2출력
		
		System.out.println(++i19); //3출력
		System.out.println(i19); 	//3출력
	}
}
