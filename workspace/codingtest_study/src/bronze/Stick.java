package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Stick {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		List<Integer> list = new ArrayList<>();
		List<Integer> checkNum = new ArrayList<>();

		int forCount = Integer.parseInt(st.nextToken());

		// 입력받기
		for (int i = 0; i < forCount; i++) {
			st = new StringTokenizer(bf.readLine());
			list.add(Integer.parseInt(st.nextToken()));
		}

		for (int i = list.size() - 1; i >= 0; i--) {
			if (checkNum.size() != 0) {
				if (list.get(i) > checkNum.get(checkNum.size() - 1)) {
					checkNum.add(list.get(i));
				}
			} else {
				checkNum.add(list.get(i));
			}
		}
		System.out.println(checkNum.size());

	}
}
