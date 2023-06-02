package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class KeyLoger {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		Stack<Character> stack1 = new Stack<>();
		Stack<Character> stack2 = new Stack<>();
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			String st = br.readLine();
			
			for (char c : st.toCharArray()) {
				if (c == '<') {
					if (!stack1.isEmpty()) {
						stack2.add(stack1.pop());
					}
				}else if(c == '>') {
					if (!stack2.isEmpty()) {
						stack1.add(stack2.pop());
					}
				}else if(c == '-') {
					if (!stack1.isEmpty()) {
						stack1.pop();
					}
				}else {
					stack1.add(c);
				}
			}
			
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
			
			
			while (!stack2.isEmpty()) {
				sb.append(stack2.pop());
			}
			sb.append("\n");
			stack1.clear();
			stack2.clear();
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
