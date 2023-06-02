package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Divisor {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(bf.readLine());

		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		Integer[] divisor = new Integer[count];

		for (int i = 0; i < divisor.length; i++) {
			divisor[i] = Integer.parseInt(st.nextToken());
		}

		int result = 0;
		int num = 2;
		Arrays.sort(divisor, Collections.reverseOrder());
		
		for (int i = 0; i < divisor.length; i++) {
			if (count > 1) {
				for (int j = i + 1; j < divisor.length; j++) {
					if (divisor[i] * num % divisor[j] == 0) {
						int check = divisor[i] * num;
						if (result == 0 && check == result) {
							result = check;
						} else {
							result = check;
						}
					}
				}
				num++;
			} else {
				result = divisor[i] * 2;
			}
		}
		System.out.println(result);

	}
}
