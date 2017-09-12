package com.jasmine.T泛型.Test;

public class GenericTest {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Generic generic = new Generic();
		// ����д��
		// Object obj = generic.getObject(Class.forName("com.jasmine.T.Test.User"));
		Object obj = generic.getObject(User.class);
		System.out.println(obj instanceof User);
	}
}
