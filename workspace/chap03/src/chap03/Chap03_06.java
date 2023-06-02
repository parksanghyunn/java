package chap03;

public class Chap03_06 {
	public static void main(String[] args) {
		//배열
		int [] odds19 = {1, 2, 3, 4, 5};
		
		String[] weeks19 = {"월", "화", "수", "목", "금", "토", "일"};
		
		String[] weeks19_2 = new String[7];
		weeks19_2[0] = "월";
		weeks19_2[1] = "화";
		weeks19_2[2] = "수";
		weeks19_2[3] = "목";
		weeks19_2[4] = "금";
		weeks19_2[5] = "토";
		weeks19_2[6] = "일";
		
		System.out.println(weeks19[3]);	//목
		for (int i = 0; i < weeks19.length; i++) {
			System.out.println(weeks19[i]);
		}
		
	}
}
