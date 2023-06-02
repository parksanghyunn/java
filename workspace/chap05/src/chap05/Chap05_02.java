package chap05;

class Animal{
	String name;
	
	public void setName(String name) {
		this.name =name;
	}
}



public class Chap05_02 {
	public static void main(String[] args) {
		Animal cat19  = new Animal();
		cat19.setName("body");
		
		System.out.println(cat19.name);
	}
}
