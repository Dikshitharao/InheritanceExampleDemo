package com.blogging.multilevel;

public class FourWheeler extends Vehicle{
	String type;
	void print() {
		System.out.println("\nFrom FourWheeler class \n"+type);
	}
   void print1() {
	   System.out.println("The number of wheels of "+type+" are "+numOfWheels);
	   //Observe the above code and how we are accessing the attributes from vehicle class.
   }
}
