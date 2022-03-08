package edu.iit.cs445.spring22;

public class PushdownButton extends Button {
	public PushdownButton(PoweredObject target) {
		super(target);
	}
	
	public void pushButton() {
		if (this.isOn()) {
			// switch is on
			this.switchOff();
		}
		else {
			//switch is off
			this.switchOn();
		}
	}
}
