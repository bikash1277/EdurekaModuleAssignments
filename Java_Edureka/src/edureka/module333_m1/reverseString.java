package edureka.module333_m1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class reverseString {

	Scanner sc = new Scanner(System.in);
	String str,rev;
	int i;

	public String getText() {
		System.out.println("Enter Text to reverse");
		str=sc.next();
		return str;
	}
	public void reverseText() {
		String input= getText();
		char[] ch = input.toCharArray(); 
        List<Character> list = new ArrayList<>(); 
  
        for (char c: ch) 
            list.add(c); 
  
        Collections.reverse(list); 
        ListIterator li = list.listIterator(); 
        while (li.hasNext()) 
            System.out.print(li.next()); 
    } 
	
	public static void main(String[] args) {
		reverseString reS=new reverseString();
		reS.reverseText();
	}

}
