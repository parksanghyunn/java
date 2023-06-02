package bronze;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReversWordOrder {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		List<String> list = new ArrayList<>();
		Stack<String> st = new Stack<>();
		
		int cnt = Integer.parseInt(bf.readLine());
		
		
		for (int i = 0; i < cnt; i++) {
			list.add(bf.readLine());
		}
		
		for (int i = 0; i < list.size(); i++) {
			String [] text = new String [list.get(i).length()];
			System.out.print("Case #" + (i+1) + ": ");
			for (int j = 0; j < text.length; j++) {
				text = list.get(i).split(" ");
				st.push(text[j]);
			}
			while (!st.empty()) {
				System.out.print(st.pop() + " ");
			}
			System.out.println();
		}
		
		
	}
}
