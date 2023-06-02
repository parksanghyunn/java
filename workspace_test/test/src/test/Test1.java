package test;

public class Test1 {
	public void name(int n) {
		int answer = 0;
		String m = Integer.toString(n);
		if(n <= 100000000) {
			for (int i = 0; i < m.length(); i++) {
				answer += Integer.parseInt(String.valueOf(m.charAt(i)));
			}
		}
	}
	
	  public String solution(String S, int[][] interval) {
	        String answer = "";
	        
	        for (int i = 0; i < interval.length; i++) {
	        		String r = S.substring(interval[i][0]-1, interval[i][1]);
	        		answer = new StringBuffer(r).reverse().toString();
					
			}
	        System.out.println("Á¤´ä" + answer);
	        return answer;
	    }
	  
	  public int solution(String phone_number) {
	        int answer = 0;
	        int cnt = 0;
	        for (int i = 0; i < phone_number.length(); i++) {
				if(phone_number.charAt(i) == '-') {
					cnt++;
				}
			}
	        if(cnt == 2) {
	        	if(phone_number.length() == 13) {
	        		answer = 1;
	        	}else if(phone_number.contains("+82")) {
	        		if(phone_number.length() == 16) {
	        			answer = 3;
	        		}else {
	        			answer = -1;
	        		}
	        	}else {
	        		answer = -1;
	        	}
	        }else if(phone_number.length() == 11){
	        	answer = 2;
	        }else {
	        	answer = -1;
	        }
	        return answer;
	    }
	  
	  public static void main(String[] args) {
		  int t [][]= {
				  {1,2},
				  {1,4}
		  };
		  
		new Test1().solution("abcde", t);
	}
}

