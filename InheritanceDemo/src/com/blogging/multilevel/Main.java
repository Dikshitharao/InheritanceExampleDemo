package com.blogging.multilevel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle();
		v.numOfWheels = 4;
		v.print();
		
		FourWheeler f = new FourWheeler();
		f.numOfWheels = 4;
		f.type = "Car";
		f.print();
		f.print1();
		
		Car c = new Car();
		c.model="BMW";
		c.numOfWheels = 4;
		c.type = "car";
		c.print();
		c.print1();

	}

}
