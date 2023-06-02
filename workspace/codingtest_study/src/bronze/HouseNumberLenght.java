package bronze;

import java.util.ArrayList;
import java.util.Scanner;

public class HouseNumberLenght {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int re = 0;
		boolean b = true;
		ArrayList<Integer> result = new ArrayList<>();

		while (true) {
			ArrayList<Integer> hNumber = new ArrayList<>();
			hNumber.add(sc.nextInt());
			while (b) {
				for (int i = 0; i < hNumber.size(); i++) {
					if (hNumber.get(i) == 0) {
						b = false;
					} else {
						hNumber.add(sc.nextInt());
					}
				}
			}
			for (int i = 0; i < hNumber.size(); i++) {
				if (hNumber.get(i) == 0) {
					break;
				} else {
					String val = hNumber.get(i).toString();
					for (int j = 0; j < val.length(); j++) {
						if (val.charAt(j) == '1') {
							re += 2;
						} else if (val.charAt(j) == '0') {
							re += 4;
						} else {
							re += 3;
						}
					}
					
					result.add(re + 2+(val.length()-1));
					re = 0;
				}
			}
			break;
		}
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
		 sc.close();
	}
}
