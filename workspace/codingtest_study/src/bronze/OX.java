package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class OX {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		List<String> totalOx = new ArrayList<>();
		
		int cnt  = Integer.parseInt(bf.readLine());
		
		for (int i = 0; i < cnt; i++) {
			totalOx.add(bf.readLine());
		}
		
		for (int i = 0; i < totalOx.size(); i++) {
			int result = 0;
			int oCnt = 0;
			for (int j = 0; j < totalOx.get(i).length(); j++) {
				if(totalOx.get(i).charAt(j) == 'O') {
					oCnt++;
					result += oCnt;
				}else{
					oCnt = 0;
				}
			}
			System.out.println(result);
		}
	}
}
