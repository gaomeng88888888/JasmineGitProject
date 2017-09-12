package com.jasmine.annotation注解;

public @interface MyAnnotation {
	String value();
}

class Test{
	@MyAnnotation ("123a")
	public void myMethod(){
		
	}
}