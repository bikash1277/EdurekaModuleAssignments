package edureka.module333_m1;


import java.util.Scanner;

public class ATMPinTest {

	public void validateText() {
		int attemps = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter Pin Code: ");
		double ExpectedPIN=0 ;
		double CORRECT_PIN = 1234;
		while (ExpectedPIN != CORRECT_PIN && attemps < 3) {
			ExpectedPIN = keyboard.nextInt();
			attemps++;
			if (ExpectedPIN != CORRECT_PIN && attemps < 3) {
				System.out.println("PIN is incorrect! Try again!"); 
			}
		}
		if (ExpectedPIN == CORRECT_PIN && attemps <= 3) {
			System.out.println("Welcome to Bank!!!");
		} else {
			System.out.println("Your ATM card has been blocked.");
		}	}

	public static void main(String[] args) {
		ATMPinTest atm = new ATMPinTest();
		atm.validateText();
	}

}
