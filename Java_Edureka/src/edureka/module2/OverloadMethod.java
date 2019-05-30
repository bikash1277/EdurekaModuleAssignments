package edureka.module2;

public class OverloadMethod {

	public void multiply(int val1,int val2) {
		int Result=val1*val2;
		System.out.println("The Result of int is:"+Result);
	}
	
	public void multiply(float val1,float val2) {
		float Result=val1*val2;
		System.out.println("The Result of float is:"+Result);
	}
	
	public static void main(String[] args) {
		OverloadMethod om=new OverloadMethod();
		om.multiply(10,20);
		om.multiply(10.5f, 2.5f);
	}
}
