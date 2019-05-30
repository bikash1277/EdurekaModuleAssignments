package edureka.module1;

import java.util.Scanner;

public class propertyBid {

	
		double micheaelBidPrice, bruceBidPrice;
		Scanner sc = new Scanner(System.in);
		
		
		public void getBidPrice() {
			System.out.println("Enter Michael Bid price:");
			micheaelBidPrice = sc.nextDouble();
			System.out.println("Enter Bruce Bid Price:");
			bruceBidPrice = sc.nextDouble();
					}
		public String comapreBidPrice() {
			String result=null;
			if (micheaelBidPrice>bruceBidPrice) {
				result="micheal Bid Price is more than Bruce";
			}
			else if (bruceBidPrice>micheaelBidPrice) {
				result="Bruce Bid Price is more than Michael";
			}
			else {
				result="Bruce Bid Price is equal to Michael";
			}
			return result;
		}
		public static void main(String[] args) {
			propertyBid bidPrice=new propertyBid();
			bidPrice.getBidPrice();
			System.out.println("The Winner of Bid ::"+bidPrice.comapreBidPrice());
	}

}
