package edureka.module2;

public class OverrideMethod extends OverloadMethod{

	public void multiply(int val1,int val2) {
		int Result=val1+val2;
		System.out.println("The Result of int is:"+Result);
	}
	
	public static void main(String[] args) {
		OverrideMethod orm=new OverrideMethod();
		orm.multiply(10, 20);

		OverloadMethod orm2=new OverloadMethod();
		orm2.multiply(20, 2);

	}

}
