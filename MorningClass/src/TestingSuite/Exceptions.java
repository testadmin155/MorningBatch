package TestingSuite;

public class Exceptions {

	public static void main(String[] args) {
		System.out.println("test");
		System.out.println("test1");
		System.out.println("test2");
		System.out.println("test3");
		
		//Arithematic Exception
		/*int x = 10;
		int y = 0;
		//int c= x/y;
		
		try {
			int c= x/y;
		}
		//catch (Exception e)
		catch (ArithmeticException e)
		{
			System.out.println(e);
		} */
		
		
		//ArrayIndex outof bound exception
		//Array
		int x[] = new int[5];
		x[0]=50;
		x[4]=68;
		try
		{
			x[5]=79;
		}
		
		//catch(Exception e)
		 catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		
		/*catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}*/
		
		finally {
			System.out.println("i am executed finally");
		}
		
		System.out.println("test4");
		System.out.println("test5");
		
		
		
		

	}

}