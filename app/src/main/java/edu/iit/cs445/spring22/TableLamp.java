package edu.iit.cs445.spring22;

import powerControllers.*;
import poweredObjects.*;

public class TableLamp {
	private Lightbulb myLightbulb;
	private PushdownButton myButton;
	
	public TableLamp() {
		myLightbulb = new Lightbulb();
		myButton = new PushdownButton();
	}
	
	public TableLamp(Lightbulb lightbulb) {
		myLightbulb = lightbulb;
		myButton = new PushdownButton();
	}
	
	public TableLamp(PushdownButton pdbutton) {
		myLightbulb = new Lightbulb();
		myButton = pdbutton;
	}
	
	public TableLamp(Lightbulb lightbulb, PushdownButton pdbutton) {
		myLightbulb = lightbulb;
		myButton = pdbutton;
	}
	
	public void pushButton() {
		myButton.pushButton();
		if (myButton.getState()) {
			myLightbulb.connectPower();
		}
		else {
			myLightbulb.disconnectPower();
		}
	}
}
