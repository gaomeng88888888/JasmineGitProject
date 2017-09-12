package com.jasmine.classTest关于类的测试;

public class AbstractInterface {
	public static void main(String[] args) {
		Car car = new Car();
		car.show();
	}
}

abstract interface Rush{
	public void show();
}

class Car implements Rush{
	@Override public void show() { System.out.println("Car"); }
}