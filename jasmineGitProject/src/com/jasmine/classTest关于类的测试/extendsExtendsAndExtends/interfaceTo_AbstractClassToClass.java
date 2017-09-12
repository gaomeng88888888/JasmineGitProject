package com.jasmine.classTest关于类的测试.extendsExtendsAndExtends;

/**
 * 
 * */

public class interfaceTo_AbstractClassToClass {
	public static void main(String[] args) {
		Class<? super Ccc> biubiubiu = Ccc.class.getSuperclass();
		System.out.println(biubiubiu);
		try {
			Class<?> forName = Class.forName(biubiubiu.getName());
			I i = (I) forName.newInstance();
			i.i();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}