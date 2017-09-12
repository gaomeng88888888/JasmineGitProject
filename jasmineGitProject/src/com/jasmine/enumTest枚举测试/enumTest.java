package com.jasmine.enumTest枚举测试;

public class enumTest {
	public static void main(String[] args) {
		DD e = DD.Aa;
		System.out.println(e);
		System.out.println(e.getS1());
		System.out.println(e.getS2());
	}
}

enum DD {
	Aa("...","ss");
  	private String s1;
	private String s2;
  	
	private DD(String s1, String s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public String getS1() {
		return s1;
	}

	public String getS2() {
		return s2;
	}
}