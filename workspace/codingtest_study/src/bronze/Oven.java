package bronze;

import java.util.Scanner;

public class Oven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int cookTime = sc.nextInt();
		sc.close();
		
		if (cookTime >= 60) {
			hour += cookTime / 60;
			min += cookTime % 60;
		}else{
			min += cookTime;
		}
		
		if (min >= 60) {
			min -= 60;
			hour += 1;
		}
		if (hour >= 24) {
			hour %= 24 ;
		}
		
		System.out.print(hour + " " + min);
		
	}
}

