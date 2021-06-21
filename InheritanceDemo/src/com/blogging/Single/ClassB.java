package com.blogging.Single;

public class ClassB extends ClassA{
 int b;
 public void print() {
	 System.out.println(b+" Child class variable");
	 System.out.println(a+" Parent class variable printing from child class");
	 //Observe that we can access attributes from parent class
    //in sub class by extending the main class.
 }
}
