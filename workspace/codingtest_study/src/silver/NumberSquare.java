package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberSquare {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int [][] arr = new int[n][m];
		String [] num = new String [n];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(bf.readLine());
			num[i] = st.nextToken();
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = Character.getNumericValue(num[i].charAt(j));
			}
		}
		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
		
		int minNum = Math.min(n, m);
		int maxArea = 1;
		int area = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				for (int k = 1; k < minNum; k++) {
					if (i+k < n && j+k < m) {
						if (arr[i][j] == arr[i][j+k] && arr[i][j] == arr[i+k][j] && arr[i][j] == arr[i+k][j+k]) {
							area = (((j+k)-j)+1) * (((i+k) - i)+1);
							if (area > maxArea) {
								maxArea = area;
							}
						}
					}
				}
					
			}
		}
		System.out.println(maxArea);
	}
}
