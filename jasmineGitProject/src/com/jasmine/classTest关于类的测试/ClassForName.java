package com.jasmine.classTest关于类的测试;

public class ClassForName {
	public static void main(String[] args) throws ClassNotFoundException{
		Class<?> forName = Class.forName("com.jasmine.classTest关于类的测试.TT");
		Class<?> forName2 = Class.forName("com.jasmine.classTest关于类的测试.TT");
		Class<?> forName3 = Class.forName("com.jasmine.classTest关于类的测试.TT");
		Class<?> forName4 = Class.forName("com.jasmine.classTest关于类的测试.TT");
		Class<?> getclass = TT.class;
		System.out.println(forName);//class com.jasmine.classTest关于类的测试.TT
		System.out.println(getclass);
		System.out.println(forName.equals(getclass));//true
		System.out.println(forName==getclass);//true
	}
}

class TT{
	static { 
		System.err.println("static");
	}
}