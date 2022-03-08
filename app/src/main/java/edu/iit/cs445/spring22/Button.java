package edu.iit.cs445.spring22;

public class Button extends PowerSwitch{
	public Button(PoweredObject target) {
		super(target);
	}
	
	public void switchOn() {
		System.out.println("Button switched to ON");
		super.switchOn();
	}
	
	public void switchOff() {
		System.out.println("Button switched to OFF");
		super.switchOff();
	}
}
