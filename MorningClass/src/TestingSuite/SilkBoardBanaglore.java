package TestingSuite;

public class SilkBoardBanaglore extends TrafficSignaling{

	public static void main(String[] args) {
		SilkBoardBanaglore SB = new SilkBoardBanaglore();
		SB.GreenLight();
		SB.greenlightwaittime();
		SB.OrangeLight();
		SB.Orangelightwaittime();
		SB.RedLight();
		SB.Redlightwaittime();

	}

	@Override
	public void greenlightwaittime() {
		System.out.println("Greenlight for 45 secs");
		
	}

	@Override
	public void Redlightwaittime() {
		System.out.println("Greenlight for 20 secs");
		
	}

	@Override
	public void Orangelightwaittime() {
		System.out.println("Greenlight for 15 secs");
		
	}

}
