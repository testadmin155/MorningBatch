package TestingSuite;

public class wrapperClass {

	public static void main(String[] args) {
		/*wrapper class
		primitiver Datatypes
		
		int  - Integer
		char	- Character
		double  - Double 
		boolean  - Boolean
		float  - Float
		*/
		
		String mobile = "29990.90";
		String headset = "1000.00";
		
		//wrapping
		//int mobilecost=Integer.parseInt(mobile);
		//int headsetcost = Integer.parseInt(headset);
		
		//int totalamount = mobilecost+headsetcost;
		//System.out.println(totalamount);
		
		double mobilecost = Double.parseDouble(mobile);
		System.out.println(mobilecost);
		double headesetcost = Double.parseDouble(headset);
		System.out.println(headesetcost);
		
		double totalcost=mobilecost+headesetcost;
		System.out.println(totalcost);
	}

}
