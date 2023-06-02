package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MasterOfRecursion {
	private static int cnt = 0;
	
	//팰린더룸 구하기
	//팰린더룸이면 1, 아니면 0 출력
	public static int pal(String s, int start, int end) {
		cnt++;
		//앞쪽 인덱스가 뛰쪽 인덱스 이상일 경우 return 1 후 함수 종료
		// -> 시작인덱스와 끝인덱스가 만나는 지점은 문자열의 중앙(문자열의 길이가 홀수인 경우 시작인덱스는 중앙 +1)이기 때문에 시작인덱스가 같거나 더 크면 해당 문자열은 앞과 뒤가 같은 문자열임을 뜻한다.
		if(start>=end) {
			return 1;
			//앞쪽 인덱스의 값과 뒤쪽 인데스의 값이 다를 경우 return 0 후 함수 종료
		}else if(s.charAt(start) != s.charAt(end)) {
			return 0;
		}else {
			//위 두 조건이 모두 false일 경우 팰린더룸구하는 함수 재귀호출 후 위 중 하나가 참이 될때까지 반복
			//시작 인덱스는 1씩 더해주며 앞에서 뒤쪽으로 이동
			//끝 인덱스는 1씩 빼주면서 뒤에서 앞쪽으로 이동
			return pal(s, start+1, end-1);
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < num; i++) {
			String s = br.readLine();
			
			//문자열 한줄, 시작인덱스, 마지막 인덱스를 파라미터로 넘겨준다
			System.out.println(pal(s, 0, s.length()-1) + " " + cnt);
			cnt = 0;
		}
	}
}
