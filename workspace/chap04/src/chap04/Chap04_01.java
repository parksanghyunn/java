package chap04;

public class Chap04_01 {
	public static void main(String[] args) {
		//if문
		boolean money19 = true;
		if (money19) {
			System.out.println("택시를 타고 가라");
		}else {
			System.out.println("걸어가라");
		}
		
		int m19 = 2000;
		if (m19 >= 3000) {
			System.out.println("택시를 타고 가라");
		}else {
			System.out.println("걸어가라");
		}
		
		if (m19 >= 3000 || money19) {
			System.out.println("택시를 타고 가라");
		}else {
			System.out.println("걸어가라");
		}
		
		//다중 if문
		if (m19 >= 3000) {
			System.out.println("택시를 타고 가라");
		}else {
			if (money19) {
				System.out.println("택시를 타고 가라");
			}
			System.out.println("걸어가라");
		}
		
	}
}
