package edu.iit.cs445.spring22;

public class Lightbulb extends PoweredObject{
	
	public Lightbulb() {
		super();
	}
	
	public void on() {
		super.on();
		System.out.println("Lightbulb on.");
	}
	
	public void off() {
		super.off();
		System.out.println("Lightbulb off.");
	}
}
