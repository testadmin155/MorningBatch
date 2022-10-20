package package1;

public class class1 {
	
	public void PublicMethod()
	{
		System.out.println("I am a public Method");
	}
	
	void DefaultMethod()
	{
		System.out.println("I am default Method");
	}
	
	protected void ProtectedMethod() 
	{
		System.out.println("I am protected Method");
	}
	
	private void PrivateMethod() 
	{
		System.out.println("I am private Method");
	}

	public static void main(String[] args) {
		// 4 types of access modifiers
		//public, default, protected and private
		
		class1 obj = new class1();
		obj.PublicMethod();
		obj.DefaultMethod();
		obj.ProtectedMethod();
		obj.PrivateMethod();

	}

}
