package edureka.module3;

import java.util.HashMap;

public class hashMapTest {
	HashMap<String, Integer> hashMap=new HashMap<>();
	
	public hashMapTest() {
		hashMap.put("Bikash", 1);
		hashMap.put("Aditi", 2);
		hashMap.put("Adash",3);
		hashMap.put("Bikiti",4);
		
	}
	public void displayHashMap() {
		System.out.println("The hashMap is ::"+hashMap);
	}
	public void displayKey() {
		System.out.println("The keys are ::"+hashMap.keySet());
	}
	public void displayValue() {
		System.out.println("The Values of each keys are:"+hashMap.values());
	}
	
	
	public static void main(String[] args) {
		hashMapTest hm=new hashMapTest();
		hm.displayHashMap();
		hm.displayKey();
		hm.displayValue();
	
	}

}
