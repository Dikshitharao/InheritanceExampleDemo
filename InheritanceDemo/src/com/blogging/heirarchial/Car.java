package com.blogging.heirarchial;

public class Car extends FourWheel {
	String model;
	void print() {
		System.out.println("\nThis statement is been printed from child"
				+ " class Car which is of model "+model+" and is of type "+type);
	}

}
