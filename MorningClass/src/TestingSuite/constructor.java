package TestingSuite;

public class constructor {
	
	public void getdata() 
	{
		System.out.println("I am a Method");
	}
	
	public constructor()
	{
		System.out.println("I am a constructor");
	}
	
	public constructor(int a)
	{
		System.out.println("I am parameter constructor");
	}
	
	public constructor(int a,String b)
	{
		System.out.println("I am parameter constructor2");
	}

	public static void main(String[] args) {
		
		constructor obj = new constructor(10,"shaik");
		//obj.getdata();
		
	}

}
