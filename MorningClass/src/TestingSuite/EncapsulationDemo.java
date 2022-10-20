package TestingSuite;

public class EncapsulationDemo {

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setSSN(45341);
		obj.setAccountNumber(5743412);
		obj.setEmployeename("anees1");
		obj.setEmail("testing@gmail1.com");
		
System.out.println(obj.getSSN());
System.out.println(obj.getAccountNumber());
System.out.println(obj.getEmployeename());
System.out.println(obj.getEmail());

	}

}
