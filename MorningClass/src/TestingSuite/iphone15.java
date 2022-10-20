package TestingSuite;

public class iphone15 implements TROIInterface{

	public static void main(String[] args) {
		
		iphone15	IP15 = new iphone15();
		
		IP15.Calling();
		IP15.CallEnding();
		IP15.CallDivert();
		IP15.Facetime();
		IP15.FrontCam();
		IP15.Messages();
		IP15.itunes();
		IP15.iwatch();
		IP15.RareCam();
		IP15.mobilesecurity();
	}
	
	public void iwatch()
	{
		System.out.println("iwatch");
	}
	
	public void itunes()
	{
		System.out.println("itunes");
	}
	
	public void Appstore()
	{
		System.out.println("Appstore");
	}
	
	public void Facetime()
	{
		System.out.println("Facetime");
	}
	
	public void FrontCam()
	{
		System.out.println("FrontCam 100MP");
	}
	
	public void RareCam()
	{
		System.out.println("RareCam 200MP");
	}
	
	@Override
	public void Calling() {
		System.out.println("Calling");
		
	}

	@Override
	public void CallEnding() {
		System.out.println("CallEnding");
		
	}

	@Override
	public void Messages() {
		System.out.println("Messages");
		
	}

	@Override
	public void CallDivert() {
		System.out.println("CallDivert");
		
	}

	@Override
	public void mobilesecurity() {
		System.out.println("mobilesecurity");
		
	}

}
