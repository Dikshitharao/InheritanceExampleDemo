package com.blogging.heirarchial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourWheel f = new FourWheel();
		f.type = "car";
		f.print();
		
		Car c = new Car();
		c.type="car";
		c.model="Benz";
		c.print();
		
		FourWheel f1 = new FourWheel();
		f1.type = "bus";
		f1.print();
		
		
		Bus b = new Bus();
		b.type = "Bus";
		b.model="Mini Bus";
		b.print();
		

	}

}
