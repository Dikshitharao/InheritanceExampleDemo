package com.blogging.Single;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA a = new ClassA();
		a.a=10;
		a.print();
		
		ClassB b = new ClassB();
		b.b = 20;
		b.a = 15;
//We can access attributes of parent class and also modify value from child class.
		b.print();
		

	}

}
