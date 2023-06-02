package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChocolateChops {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int minVal = Math.min(n, m);
		int maxVal = Math.max(n, m);
		int cutCnt = 0;
		
		int chocolateSize = n * m;
		
		if (chocolateSize != 1) {
			cutCnt = maxVal -1;
			
			for (int i = 0; i < maxVal; i++) {
				cutCnt += minVal-1;
			}
			
			System.out.println(cutCnt);
		}else {
			System.out.println(0);
		}
		
		
	}
}
