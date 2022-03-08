package edu.iit.cs445.spring22;

public abstract class PowerSwitch {
	private PoweredObject target;
	
	public PowerSwitch(PoweredObject target) {
		this.target = target;
	}
	
	public void switchOn() {
		this.target.on();
	}
	
	public void switchOff() {
		this.target.off();
	}
	
	public boolean isOn() {
		return this.target.isOn();
	}
}
