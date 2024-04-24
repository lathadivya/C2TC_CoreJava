package com.tns.day6final;

public class FinalVariable {

	final int x = 100;
	// Declare a static blank final variable.
	final static int Y;
	final static int Z = 10;
	void change() {
	
	}
	@Override
	public String toString() {
	return "FinalVariable [x=" + x + ", Y" + Y + "]";
	}
	// Declare a static block to initialize the final static variable.
	static {
	Y = 20;
	
	System.out.println("Value of Y: " + Y);
	}
	
}
