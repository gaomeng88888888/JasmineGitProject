package com.jasmine.number拆箱装箱;

public class IntegerTest {
	public static void main(String[] args) {
		Integer i = new Integer(127);
		Integer j = new Integer(127);
		System.out.println(i==j);
		i = 128;
		j = 128;
		System.out.println(i==j);
	}
}
