package powerControllers;

public class Button{
	private boolean onState;
	
	public Button() {
		this.onState = false;
	}
	
	public void switchOn() {
		this.onState = true;
		System.out.println("Button switched to ON");
	}
	
	public void switchOff() {
		this.onState = false;
		System.out.println("Button switched to OFF");
	}
	
	public boolean getState() {
		return this.onState;
	}
}
