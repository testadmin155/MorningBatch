package TestingSuite;

public class SubClass extends SuperClass{

	public void Freetime()
	{
		System.out.println("Freetime");
	}
	
	public void student()
	{
		System.out.println("Student");
	}
	
	public void Scooty()
	{
		System.out.println("SportsBike");
		super.Scooty();
	}
	
	public static void main(String[] args) {
		SubClass child = new SubClass();
		child.Freetime();
		child.student();
		child.Scooty();
		child.money();
		child.Car();
		

	}

}
