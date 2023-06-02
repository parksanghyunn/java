package test1;

import java.util.Scanner;

import javax.swing.Spring;

public class test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int year;
		while(true)
		{
			System.out.println("입력 년도 : ");
			year = scanner.nextInt();
			if(year<1900) {System.out.print("1900년 이상의 년도를 입력하세요."); break;} // 입력한 년도가 1900년보다 작으면 종료
			System.out.printf("%d년은 ",year);
			switch(year%12)
			{
				case 0:
					System.out.println("신(원숭이)");
					break;
				case 1:
					System.out.print("유(닭)");
					break;
				case 2:
					System.out.print("술(개)");
					break;
				case 3:
					System.out.print("해(돼지)");
					break;
				case 4:
					System.out.print("자(쥐)");
					break;
				case 5:
					System.out.print("축(소)");
					break;
				case 6:
					System.out.print("인(호랑이)");
					break;
				case 7:
					System.out.print("묘(토끼)");
					break;
				case 8:
					System.out.print("진(용)");
					break;
				case 9:
					System.out.print("사(뱀)");
					break;
				case 10:
					System.out.print("오(말)");
					break;
				case 11:
					System.out.print("미(양)");
					break;
			}
			System.out.println("의 해이다.\n");
			break;
		}
	}
}


