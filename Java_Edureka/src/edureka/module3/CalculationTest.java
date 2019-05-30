package edureka.module3;

import java.util.Scanner;

public class CalculationTest {
	int val1,val2;
	Scanner sc = new Scanner(System.in);
	public void getNumber() {
		System.out.println("Enter value One is :");
		val1=sc.nextInt();
		System.out.println("Enter value Two is :");
		val2=sc.nextInt();
	}
	 public  void add() {
		 System.out.println(" The Addition of number is :"+(val1+val2));
	 }
	 public  void substraction() {
		 System.out.println(" The substraction of number is :"+(val1-val2));
	 }
	 public  void multiply() {
		 System.out.println(" The multiply of number is :"+(val1*val2));
	 }

	public static void main(String[] args) {
		CalculationTest test=new CalculationTest();
		test.getNumber();
		test.add();
		test.substraction();
		test.multiply();
		

	}
}
