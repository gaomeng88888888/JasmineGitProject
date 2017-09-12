package com.jasmine.annotation注解;

public class DeprecatedTest {
	
	public static void main(String[] args) {
		DeprecatedTest deprecatedTest = new DeprecatedTest();
		deprecatedTest.methodTest();
	}
	
	@Deprecated
	public void methodTest(){
		
	}
}
