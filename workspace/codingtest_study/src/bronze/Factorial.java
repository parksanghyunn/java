package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Factorial {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		List<String> numList = new ArrayList<>();
		int cnt = Integer.parseInt(bf.readLine());
		
		
		for (int i = 0; i < cnt; i++) {
			numList.add(bf.readLine());
		}
		
		for (int i = 0; i < numList.size(); i++) {
			BigInteger bi = new BigInteger(numList.get(i));
			
			BigInteger bi2 = BigInteger.ONE;
			for (int j = 1; j <= bi.intValue(); j++) {
				BigInteger bi3 = new BigInteger(String.valueOf(j));
				bi2 = bi2.multiply(bi3);
			}
			for (int j = bi2.toString().length()-1; j >= 0; j--) {
				if (bi2.toString().charAt(j) != '0') {
					System.out.println(bi2.toString().charAt(j));
					break;
				}
			}
		}
	}
}
