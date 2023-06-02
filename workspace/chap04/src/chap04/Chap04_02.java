package chap04;

public class Chap04_02 {
	public static void main(String[] args) {
		// switch/case
		int month19 = 8;
		String monthString19 = "";
		switch (month19) {
		case 1:
			monthString19 = "January";
			break;
		case 2:
			monthString19 = "February";
			break;
		case 3:
			monthString19 = "March";
			break;
		case 4:
			monthString19 = "April";
			break;
		case 5:
			monthString19 = "May";
			break;
		case 6:
			monthString19 = "June";
			break;
		case 7:
			monthString19 = "July";
			break;
		case 8:
			monthString19 = "August";
			break;
		case 9:
			monthString19 = "September";
			break;
		case 10:
			monthString19 = "October";
			break;
		case 11:
			monthString19 = "November";
			break;
		case 12:
			monthString19 = "December";
			break;
		default:
			monthString19 = "Invalid month";
			break;
		}
		System.out.println(monthString19);
	}
}
