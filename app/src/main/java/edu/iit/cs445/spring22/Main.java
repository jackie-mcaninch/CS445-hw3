package edu.iit.cs445.spring22;

import powerControllers.*;
import poweredObjects.*;

public class Main {
	public static void main(String[] args) {
        Button button = new Button();
        button.switchOn();
        button.switchOff();
        
        Lightbulb lightbulb = new Lightbulb();
        lightbulb.connectPower();
        lightbulb.disconnectPower();
        
        TableLamp tablelamp = new TableLamp();
        tablelamp.pushButton();
        tablelamp.pushButton();
    }
}
