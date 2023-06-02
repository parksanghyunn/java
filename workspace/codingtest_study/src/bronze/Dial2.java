package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dial2 {
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
			char userInputChar = userInput.charAt(i);
			if (userInputChar <= 'c') {
				sec += 3;
			}else if(userInputChar <= 'f') {
				sec+=4;
			}else if(userInputChar <= 'i') {
				sec += 5;
			}else if(userInputChar <='l') {
				sec += 6;
			}else if(userInputChar <= 'o') {
				sec += 7;
			}else if(userInputChar <= 's') {
				sec += 8;
			}else if(userInputChar <= 'v') {
				sec += 9;
			}else {
				sec += 10;
			}
		}
		System.out.println(sec);
	}
}
