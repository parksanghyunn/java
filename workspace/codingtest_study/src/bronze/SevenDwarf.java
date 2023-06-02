package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class SevenDwarf {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> dwarfHeight = new ArrayList<>();

		int totalSum = 0;

		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			dwarfHeight.add(Integer.parseInt(st.nextToken()));
			totalSum += dwarfHeight.get(i);
		}

		for (int i = 0; i < dwarfHeight.size(); i++) {
			for (int j = i + 1; j < dwarfHeight.size(); j++) {
				int check = totalSum - dwarfHeight.get(i) - dwarfHeight.get(j);
				if (check == 100) {
					Integer fakeDwarf1 = Integer.valueOf(dwarfHeight.get(i));
					Integer fakeDwarf2 = Integer.valueOf(dwarfHeight.get(j));
					dwarfHeight.remove(fakeDwarf1);
					dwarfHeight.remove(fakeDwarf2);
					break;
				}
			}
		}

		Collections.sort(dwarfHeight);

		for (int i = 0; i < dwarfHeight.size(); i++) {
			System.out.println(dwarfHeight.get(i));
		}
	}
}
