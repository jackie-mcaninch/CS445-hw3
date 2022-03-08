package edu.iit.cs445.spring22;

public abstract class PoweredObject {
	private boolean isOn;
	
	public PoweredObject() {
		this.isOn = false;
	}
	
	public void on() {
		this.isOn = true;
	}
	
	public void off() {
		this.isOn = false;
	}
	
	public boolean isOn() {
		return this.isOn;
	}
}
