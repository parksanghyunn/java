package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class InversionJosephus {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuffer sb = new StringBuffer();
		
		Deque<Integer> deq = new LinkedList<>();
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int cnt = 0;
		boolean check = false;
		
		for (int i = 1; i <= N; i++) {
			deq.offer(i);
		}
		
		int i = 0;
		while (!deq.isEmpty()) {
			i++;
			if (cnt == M) {
				if (check) {
					check = false;
				}else {
					check = true;
				}
				cnt = 0;
			}
			if (i < K) {
				if (check) {
					deq.offerFirst(deq.pollLast());
				}else {
					deq.offerLast(deq.pollFirst());
				}
			}else {
				if (check) {
					sb.append(deq.pollLast()).append("\n");
				}else {
					sb.append(deq.pollFirst()).append("\n");
				}
				i = 0;
				cnt++;
			}
		}
		bw.write(sb.toString());
		bw.flush();
	}
}
