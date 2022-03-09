package poweredObjects;

public abstract class PoweredObject {
	private boolean isOn;
	
	public PoweredObject() {
		this.isOn = false;
	}
	
	public void connectPower() {
		this.isOn = true;
	}
	
	public void disconnectPower() {
		this.isOn = false;
	}
	
	public boolean isOn() {
		return this.isOn;
	}
}
