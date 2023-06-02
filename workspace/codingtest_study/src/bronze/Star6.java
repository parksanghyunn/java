package bronze;

import java.util.Scanner;

public class Star6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int floor = sc.nextInt();
		sc.close();
		for (int i = 0; i < floor; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for (int j = i; j < floor * 2 - (i+1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
