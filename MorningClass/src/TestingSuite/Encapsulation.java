package TestingSuite;

public class Encapsulation {
	
	private int SSN;
	private int AccountNumber;
	private String employeename;
	private String email;
	

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setSSN(4534);
		obj.setAccountNumber(574342);
		obj.setEmployeename("anees");
		obj.setEmail("testing@gmail.com");
		
System.out.println(obj.getSSN());
System.out.println(obj.getAccountNumber());
System.out.println(obj.getEmployeename());
System.out.println(obj.getEmail());
	}


	public int getSSN() {
		return SSN;
	}


	public void setSSN(int sSN) {
		SSN = sSN;
	}


	public int getAccountNumber() {
		return AccountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}


	public String getEmployeename() {
		return employeename;
	}


	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

}
