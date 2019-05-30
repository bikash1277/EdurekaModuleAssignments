package edureka.module333_m1;

import java.util.Scanner;

public class NamePrint {
	String str;
	int i;
	Scanner sc = new Scanner(System.in);
	
	public String getInput() {
		System.out.println("Please Enter the input Value::");
		str= sc.next();
		return str;
	}
	public void displayValue() {
		System.out.println("Your Name is "+ getInput());
	}

	public static void main(String[] args) {
		NamePrint name=new NamePrint();
		name.displayValue();

		
	}

}
