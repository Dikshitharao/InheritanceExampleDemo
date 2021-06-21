package com.blogging.multilevel;

public class Car extends FourWheeler{
	String model;
	void print(){
		System.out.println("\nFrom car class \n"+model);
	}
	
	void print1() {
		System.out.println("The number of wheels of "+type+" of model "+model+" is "+numOfWheels);
		 //Observe the above code and how we are accessing the attributes from vehicle and FourWheeler class.
	}

}
