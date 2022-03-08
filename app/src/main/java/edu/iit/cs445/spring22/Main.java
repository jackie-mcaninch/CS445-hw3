package edu.iit.cs445.spring22;

public class Main {
	public static void main(String[] args) {
    	Lightbulb lightbulb = new Lightbulb();
        Button button = new Button(lightbulb);
        button.switchOn();
        button.switchOff();
        
        TableLamp tablelamp = new TableLamp(lightbulb);
        tablelamp.pushButton();
        tablelamp.pushButton();
        button.switchOn();
        tablelamp.pushButton();
    }
}
