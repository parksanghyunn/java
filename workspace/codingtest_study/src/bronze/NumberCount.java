package bronze;

import java.util.Scanner;

public class NumberCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		String mulNum = String.valueOf(num1*num2*num3);
		
		int [] cnt = new int[10];
		for (int i = 0; i < mulNum.length(); i++) {
			for (int j = 0; j < cnt.length; j++) {
				if (Character.getNumericValue(mulNum.charAt(i)) == j) {
					cnt[j] +=1;
				}
			}
		}
		
		for (int i = 0; i < cnt.length; i++) {
			System.out.println(cnt[i]);
		}
	}
}
