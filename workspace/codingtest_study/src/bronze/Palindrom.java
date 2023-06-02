package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Palindrom {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<String> text = new ArrayList<>();
		Stack<Character> palindromText = new Stack<>();

		int forCnt = Integer.parseInt(bf.readLine());

		for (int i = 0; i < forCnt; i++) {
			text.add(bf.readLine().toLowerCase());
		}

		
		for (int i = 0; i < text.size(); i++) {
			int cnt = 0;
			
			//stack에 담아 문자열 뒤집기
			for (int j = 0; j < text.get(i).length(); j++) {
				palindromText.push(text.get(i).charAt(j));
			}

			for (int j = 0; j < text.get(i).length(); j++) {
				if (palindromText.pop() == text.get(i).charAt(j)) {
					cnt++;
				}
			}
			
			if (cnt == text.get(i).length()) {
				bw.write("Yes");
				bw.newLine();
			} else {
				bw.write("No");
				bw.newLine();
			}
		}
		
		bw.flush();
		bf.close();
		bw.close();
	}
}
