package TestingSuite;

public class Overloading {
	public void getdata()
	{
		System.out.println("Method to getData1");
	}
	
	public void getdata(int a)
	{
		System.out.println("Method to getData2");
	}
	
	public void getdata(String b)
	{
		System.out.println("Method to getData3");
	}

	public void getdata(int a, int d)
	{
		System.out.println("Method to getData4");
	}
	
	public void getdata(int a, String d)
	{
		System.out.println("Method to getData5");
	}
	
	public static void main(String[] args) {
		
		Overloading obj = new Overloading();
		obj.getdata(1,"Anees");

	}

}
