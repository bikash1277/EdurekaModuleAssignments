package edureka.module333_m1;

import java.util.Scanner;

public class CalenderPrint {
	Scanner sc = new Scanner(System.in);
	int i;
	public int getInput() {
	System.out.println("Enter month Number::");	
	i=sc.nextInt();
	return i;
	}
	public void displayMonth() {
		switch (getInput()) {
		case 1:
			System.out.println("Month Name is January");
			break;
		case 2:
			System.out.println("Month Name is Febuary");
			break;
		case 3:
			System.out.println("Month Name is March");
			break;
		case 4:
			System.out.println("Month Name is April");
			break;
		case 5:
			System.out.println("Month Name is May");
			break;
		case 6:
			System.out.println("Month Name is June");
			break;
		case 7:
			System.out.println("Month Name is July");
			break;
		case 8:
			System.out.println("Month Name is August");
			break;
		case 9:
			System.out.println("Month Name is Septemeber");
			break;
		case 10:
			System.out.println("Month Name is October");
			break;
		case 11:
			System.out.println("Month Name is Novemeber");
			break;
		case 12:
			System.out.println("Month Name is December");
			break;
		default:
			System.out.println(" Enter a Number between 1-12");
			break;
		}
	}
	
	public static void main(String[] args) {
		CalenderPrint cal=new CalenderPrint();
//		cal.getInput();
		cal.displayMonth();
	
	}

}
