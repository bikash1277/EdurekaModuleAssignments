/**
 * 
 */
package edureka.module2;

import java.util.Scanner;

/**
 * @author BikashMishra
 *
 */
public class CardMessage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Card Number between 1-10 :");
		int cardNumber = sc.nextInt();
		switch (cardNumber) {
		case 1:
			System.out.println("card number is 1");
			break;
		case 2:
			System.out.println("card number is 2");
			break;
		case 3:
			System.out.println("card number is 3");
			break;
		case 4:
			System.out.println("card number is 4");
			break;
		case 5:
			System.out.println("card number is 5");
			break;
		case 6:
			System.out.println("card number is 6");
			break;
		case 7:
			System.out.println("card number is 7");
			break;
		case 8:
			System.out.println("card number is 8");
			break;
		case 9:
			System.out.println("card number is 9");
			break;
		case 10:
			System.out.println("card number is 10");
			break;
		default:
			System.out.println("Card number is out of game");
			break;
		}

	}

}
