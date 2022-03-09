package powerControllers;

public class PushdownButton extends Button {
	public PushdownButton() {
		super();
	}
	
	public void pushButton() {
		if (this.getState()) {
			// switch is on
			super.switchOff();
		}
		else {
			//switch is off
			super.switchOn();
		}
	}
}
