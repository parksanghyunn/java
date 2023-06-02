package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dial {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String userInput = "";
		int sec = 0;
		
		try {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			userInput = st.nextToken();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		userInput = userInput.toLowerCase();
		
		for (int i = 0; i < userInput.length(); i++) {
			switch (userInput.charAt(i)) {
			case 'a':sec += 3;break;
			case 'b':sec += 3;break;
			case 'c':sec += 3;break;
			case 'd':sec += 4;break;
			case 'e':sec += 4;break;
			case 'f':sec += 4;break;
			case 'g':sec += 5;break;
			case 'h':sec += 5;break;
			case 'i':sec += 5;break;
			case 'j':sec += 6;break;
			case 'k':sec += 6;break;
			case 'l':sec += 6;break;
			case 'm':sec += 7;break;
			case 'n':sec += 7;break;
			case 'o':sec += 7;break;
			case 'p':sec += 8;break;
			case 'q':sec += 8;break;
			case 'r':sec += 8;break;
			case 's':sec += 8;break;
			case 't':sec += 9;break;
			case 'u':sec += 9;break;
			case 'v':sec += 9;break;
			case 'w':sec += 10;break;
			case 'x':sec += 10;break;
			case 'y':sec += 10;break;
			case 'z':sec += 10;break;
			default: sec += 0;break;
			}
		}
		System.out.println(sec);
	}
}
