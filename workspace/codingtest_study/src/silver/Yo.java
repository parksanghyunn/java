package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Yo {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Queue<Integer> que = new LinkedList<>();
		StringBuffer sb = new StringBuffer("<");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		for (int i = 1; i <= n; i++) {
			que.offer(i);
		}
		
		while (!que.isEmpty()) {
			for (int i = 1; i <= k; i++) {
				if (i < k) {
					que.offer(que.poll());
				}else {
					if (que.size() == 1) {
						sb.append(que.poll());
					}else {
						sb.append(que.poll()).append(", ");						
					}
				}
			}
		}
		
		sb.append(">");
		System.out.println(sb);
		
		
	}
}
