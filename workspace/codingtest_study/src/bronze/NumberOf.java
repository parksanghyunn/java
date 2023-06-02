package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class NumberOf {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine().trim()," ");
		
		List<String> text = new ArrayList<>();
		
		while (st.hasMoreTokens()) {
			text.add(st.nextToken());
		}
		
		System.out.println(text.size());
		
	}
}
