package bronze;

import java.util.Scanner;

public class Star4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sNum = sc.nextInt();
		
		for (int i = 0; i < sNum; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = sNum; j > i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
