package TestingSuite;

public class MahadevapuraBangalore extends TrafficSignaling{

	public static void main(String[] args) {
		MahadevapuraBangalore Mahadevapura = new MahadevapuraBangalore();
		Mahadevapura.GreenLight();
		Mahadevapura.greenlightwaittime();
		Mahadevapura.OrangeLight();
		Mahadevapura.Orangelightwaittime();
		Mahadevapura.RedLight();
		Mahadevapura.Redlightwaittime();

	}

	@Override
	public void greenlightwaittime() {
		System.out.println("Greenlight for 90 secs");
		
	}

	@Override
	public void Redlightwaittime() {
		System.out.println("Greenlight for 45 secs");
		
	}

	@Override
	public void Orangelightwaittime() {
		System.out.println("Greenlight for 10 secs");
		
	}

}
