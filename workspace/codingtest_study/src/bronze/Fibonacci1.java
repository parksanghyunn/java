package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci1 {
	public static int fi(int n) {
		if(n == 1 || n == 2) return 1;
		
		return fi(n-1) + fi(n-2);
	}
	
	public static void main(String[] args) throws IOException{
		//피보나치 수열
		//1 1 2 3 5 8 13 ...
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(fi(n));

		int [] ar = new int[n+1];
		
		//다이나믹 프로그래밍(동적 프로그래밍) - 반복문 사용
		// - 사용 조건 	1. 작은문제가 반복적으로 발생
		//			2. 겹치는 부분이 있어야 함
		
		//ex) n = 5 
		
		//피보나치 수열에서  1번째와 2번째 값은 무조건 1이기 때문에 1,2 인덱스에 1을 담아준다.
		ar[1] = 1;
		ar[2] = 1;
		
		int cnt = 0;
		
		//1,2 인덱스에는 1이 담겨져 있기 때문에 3번째 인덱스부터 시작
		//인덱스 3부터 5까지 반복
		for (int i = 3; i <= n; i++) {
			// i = 3 -> ar[3] = ar[2](= 1) + ar[1](= 1) -> ar[3] = 2
			// i = 4 -> ar[4] = ar[3](= 2) + ar[2](= 1) -> ar[4] = 3
			// i = 5 -> ar[5] = ar[4](= 3) + ar[3](= 2) -> ar[5] = 5
			ar[i] = ar[i-1] + ar[i-2];
			cnt++;
		}
		System.out.println(cnt);
	}
}
