package bronze;

import java.util.Scanner;

public class ModifySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int f = sc.nextInt();
		sc.close();
		
		String re = "";
		String re2 = "";
		int nCopy1 = n;
		int nCopy2 = n;
		String nS = String.valueOf(n).substring(0, String.valueOf(n).length()-2);
		
		//n을 1씩 뺐을때 나누어 지는 값중 가장 작은 값 찾기
		while (true) {
			String d = String.valueOf(nCopy1);
			if (!d.substring(0, d.length()-2).equals(nS)) {
				break;
			}
			int m = nCopy1 % f;
			if (m == 0) {
				re = String.valueOf(nCopy1);
			}
			nCopy1-=1;
		}

		//n을 1씩 더했을때 나누어 지는 값 찾기
		while (true) {
			String d = String.valueOf(nCopy2);
			if (!d.substring(0, d.length()-2).equals(nS)) {
				break;
			}
			int m = nCopy2 % f;
			if (m == 0) {
				re2 = String.valueOf(d);
				break;
			}
			nCopy2 += 1;
		}
		
		if (re2 != "" && re != "") {
			System.out.println(re.substring(re.length()-2, re.length()));
		}else if(re2 != "") {
			System.out.println(re2.substring(re2.length()-2, re2.length()));
		}else if(re != "") {
			System.out.println(re.substring(re.length()-2, re.length()));
		}
	}
}
