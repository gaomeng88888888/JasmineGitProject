package com.jasmine.string;

public class StringTest {
	public static void main(String[] args) {
		String s = null;
		s += "123";
		System.out.println(s);//输出null123，很神奇吧。
		
		String a = "a";
		String b = "b";
		String ab1 = "a" + "b";
		String ab2 = "a" + "b";
		String ab_1 = a + b;
		String ab_2 = a + b;
		System.out.println(ab1 == ab2);//true
		System.out.println(ab_1 == ab_2);//false
	}
}
