package poweredObjects;

public class Lightbulb extends PoweredObject{
	
	public Lightbulb() {
		super();
	}
	
	public void connectPower() {
		super.connectPower();
		System.out.println("Lightbulb on.");
	}
	
	public void disconnectPower() {
		super.disconnectPower();
		System.out.println("Lightbulb off.");
	}
}
