package chap04;

public class Chap04_03 {
	public static void main(String[] args) {
		//while 조건문
		int treeHit19 = 0;
		while (treeHit19 < 10) {
		    treeHit19++;
		    System.out.println("나무를  " + treeHit19 + "번 찍었습니다.");
		    if (treeHit19 == 10) {
		        System.out.println("나무 넘어갑니다.");
		    }
		}
		
		//무한루프
//		while (true) {
//			System.out.println("Ctrl-C를 눌러야 while문을 빠져 나갈 수 있습니다.");
//		}
		
		int coffee19 = 10;
		int money19 = 300;
		
		while (money19 > 0) {
			System.out.println("돈을 받았으니 커피를 줍니다.");
			coffee19--;
			System.out.println("남은 커피의 양은" + coffee19 + "입니다.");
			if (coffee19 == 0) {
				System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
				break;
			}
		}
		
		int a19 = 0;
		while (a19 < 10) {
		    a19++;
		    if (a19 % 2 == 0) {
		        continue;  // 짝수인 경우 조건문으로 돌아간다.
		    }
		    System.out.println(a19);  // 홀수만 출력된다.
		}
	}
}
