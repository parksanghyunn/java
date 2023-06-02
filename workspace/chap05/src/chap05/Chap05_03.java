package chap05;

public class Chap05_03 {
	int sum(int a, int b) {
		return a + b;
	}
	
	void sum2(int a, int b) {
		System.out.println(a + b);
	}
	
	void sayNick(String nick19) {
		if ("fool".equals(nick19)) {
			return;
		}
		System.out.println("나의 별명은" + nick19);
	}
	
	int a19;
	
	void varTest(Chap05_03 ch) {
		ch.a19++; //this.a19++;
	}
	
	public static void main(String[] args) {
		int a19 = 3;
		int b19 = 4;
		
		Chap05_03 ch = new Chap05_03();
		
		int c19 = ch.sum(a19, b19);
		
		System.out.println(c19);
		
		ch.sum2(a19, b19);
		
		ch.sayNick("angel");
		ch.sayNick("fool"); //출력X
		
		ch.a19 = 1;
		ch.varTest(ch);
		System.out.println(ch.a19);
	}
}
