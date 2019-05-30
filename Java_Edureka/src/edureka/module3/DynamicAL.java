package edureka.module3;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicAL {
	String str;
	int i;
	Scanner sc = new Scanner(System.in);
	ArrayList<String> al = new ArrayList<String>();

	public void addAL() {
		System.out.println("Enter element to add into Array List:");
		str = sc.next();
		al.add(str);
	}

	public void displayAL() {
		System.out.println("Array List is here" + al);
	}

	public void removeAL() {
		System.out.println("Enter element to remove from Array List:");
		i = sc.nextInt();
		al.remove(i);
	}

	public String questionToContinue() {

		String s = null;
		System.out.println("Would you like to continue calculation:");
		String answer = sc.next();
		if (answer.contains("N") || answer.contains("n")) {
			s = "N";
		} else if (answer.contains("Y") || answer.contains("y")) {
			s = "Y";
		}
		return s;
	}

	public static void main(String[] args) {
		DynamicAL dy = new DynamicAL();
		do {
			dy.addAL();
		} while (dy.questionToContinue().equals("Y"));

		dy.displayAL();
		dy.removeAL();
		dy.displayAL();

	}

}
