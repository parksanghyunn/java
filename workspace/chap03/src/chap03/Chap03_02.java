package chap03;

public class Chap03_02 {
	public static void main(String[] args) {
		//불린
		boolean isSuccess19 = true;
		boolean isTest19 = false;
		
		/*
		 * 2 > 1 : 참
		 * 1 == 2 : 거짓
		 * 3 % 2 == 1 : 참
		 * "3".equals("2) : 거짓
		 */
		
		//조건문
		int base19 = 180;
		int heught19 = 185;
		boolean isTall19 = heught19 > base19;
		
		if (isTall19) {
			System.out.println("키가 큽니다.");
		}
		
		int i19 = 3;
		boolean isOdd = i19 % 2 == 1;
		System.out.println(isOdd);
	}
}
