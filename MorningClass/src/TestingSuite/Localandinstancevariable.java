package TestingSuite;

public class Localandinstancevariable {

	 final int x = 10; // instance variable
	
	public void num()
	{
		 //x = 5; //local variable
		System.out.println(x);
		//System.out.println(this.x);
	}
	
	public void num1()
	{
		System.out.println(x);
	}
	
	public void num2()
	{
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		Localandinstancevariable obj = new Localandinstancevariable();
		obj.num();
		//obj.num1();
		//obj.num2();
	}

}
