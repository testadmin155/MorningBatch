package TestingSuite;

public class SuperClass extends SuperSuperclass{

	public void job() {
		System.out.println("working");
	}
	
	public void money() {
		System.out.println("money");
	}
	
	public void Scooty() {
		System.out.println("Activa");
	}
	
	
	public static void main(String[] args) {
		SuperClass parent = new SuperClass();
		parent.money();
		parent.job();
		parent.Scooty();
		parent.Car();

	}

}
