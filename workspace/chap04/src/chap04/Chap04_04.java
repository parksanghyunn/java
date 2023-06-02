package chap04;

public class Chap04_04 {
	public static void main(String[] args) {
		String[] numbers19 = {"one", "two", "three"};
		for(int i=0; i<numbers19.length; i++) {
		    System.out.println(numbers19[i]);
		}
		
		int[] marks19 = {90, 25, 67, 45, 80};
		for(int i=0; i<marks19.length; i++) {
		    if (marks19[i] >= 60) {
		        System.out.println((i+1)+"번 학생은 합격입니다.");
		    }else {
		        System.out.println((i+1)+"번 학생은 불합격입니다.");
		    }
		}
		
		for(int i=0; i<marks19.length; i++) {
		    if (marks19[i] < 60) {
		        continue; 
		    }
		    System.out.println((i+1)+"번 학생 축하합니다. 합격입니다.");
		}
		
		for(int i=2; i<10; i++) {
		    for(int j=1; j<10; j++) {
		        System.out.print(i*j+" ");
		    }
		    System.out.println(""); 
		}
	}
}
