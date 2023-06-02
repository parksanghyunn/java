package bronze;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] numbers = new int[3];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		sc.close();
		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		
//		numbers[0] = num1;
//		numbers[1] = num2;
//		numbers[2] = num3;
		
		Arrays.sort(numbers);
		
		System.out.println(numbers[1]);
	}
}
