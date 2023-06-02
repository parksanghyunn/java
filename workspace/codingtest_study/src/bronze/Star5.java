package bronze;

import java.util.Scanner;

public class Star5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sNum = sc.nextInt();
		
		for (int i = 0; i < sNum; i++) {
			for (int j = sNum; j > i+1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
