package edureka.module2;

public class ConstructorClass {
	
	public ConstructorClass(int val) {
		val=100;
		System.out.println("Value is ::"+val);
	}

	public ConstructorClass(float val) {
		val=1.5f;
		System.out.println("Value is ::"+val);

	}

	public ConstructorClass() {
		System.out.println("No parameter");
	}
	
	public static void main(String[] args) {
		ConstructorClass constObj1=new ConstructorClass(10);
		ConstructorClass constObj2=new ConstructorClass(10.5f);
		ConstructorClass constObj3=new ConstructorClass();
		
	}

}
