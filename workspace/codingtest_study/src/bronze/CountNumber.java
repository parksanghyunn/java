package bronze;

import java.util.Scanner;

public class CountNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalCountNum = sc.nextInt();
		int [] num = new int [totalCountNum];
		
		for (int i = 0; i < totalCountNum; i++) {
			num[i] = sc.nextInt();
		}
		
		int selNum = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < num.length; i++) {
			if (selNum == num[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
		
	}
}
