package chap03;

public class Chap03_04 {
	public static void main(String[] args) {
		//문자열
		String a19 = "Happy Java"; 	//new String("Happy Java");
		String b19 = "a";			//new String("a");
		String c19 = "123";			//new String("123");
		
		//원시 자료형
		//int long float double boolean char
		boolean result19 = true;
		char a = 'A';
		int i19 = 10000;
		
		String e19 = new String("Happy Java");
		System.out.println(a19.equals(e19));
		System.out.println(a19 == e19);
		
		//특정 문자열의 시작 위치
		a19.indexOf("Java");	//6출력
		
		//특정 문자열의 포함 여부
		a19.contains("Java");	//true
		
		//특정 문자의 위치
		a19.charAt(6);	//J
		
		//특정 문자열을 다른 문자열로 변경
		a19.replaceAll("Java", "World");
		
		//문자열 중 특정 부분을 출력(끝위치의 문자는 포함되지 않음)
		System.out.println(a19.substring(0, 4)); //Happ
		
		//문자열을 모두 대문자로 변경
		System.out.println(a19.toUpperCase());
		
		//특정 구분자로 문자열을 나누어 배열로 리턴
		a19 = "a:b:c:d";
		String [] re19 = a19.split(":");
		
		//문자열 포매팅
		System.out.println(String.format("I eat %d apples", 3));
		System.out.println(String.format("I eat %s apples", "five"));
		int number19 = 3;
		System.out.println(String.format("I eat %d apples", number19));
		
		number19 = 10;
		String day19 = "three";
		System.out.println(String.format("I ate %d apples. so I was sick for %s days.", number19, day19));
		
		//%s는 어떤 형태의 값이든 변환가능
		System.out.println(String.format("I have %s apples",  3));  
		System.out.println(String.format("rate is %s", 3.234)); 
		
		//%를 출력하기 위해서는 %%로 해야한다
		System.out.println(String.format("Error is %d%%.", 98));
		
		//전체 길이가 10개인 문자열 공간에 hi라는 단어를 오른쪽 정렬로 출력
		System.out.println(String.format("%10s", "hi"));
		System.out.println(String.format("%-10sjane.", "hi"));  //hi        jane.
		
		//소수점 4자리까지 출력
		System.out.println(String.format("%.4f", 3.42134234));
		
		//앞 공백 생김
		System.out.println(String.format("%10.4f", 3.42134234));  //    3.4213
		
	}
}
