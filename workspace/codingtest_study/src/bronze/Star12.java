package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star12 {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int number = Integer.parseInt(bf.readLine());
		
		//상단
		for (int i = 0; i < number; i++) {
			for (int j = number-1; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//하단
		for (int i = 0; i < number-1; i++) {
			for (int j = 0; j <= i ; j++) {
				System.out.print(" ");
			}
			for (int j = number-1; j > i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
