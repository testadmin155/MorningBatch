package TestingSuite;

public class SecondClass {
	
	public void GetData()
	{
		System.out.println("Data");
	}

	public static void main(String[] args) {
		
		SecondClass y = new SecondClass();
		FirstClass z = new FirstClass();
		
		y.GetData();
		z.Login();
		z.Logout();
		
		
	}

}
