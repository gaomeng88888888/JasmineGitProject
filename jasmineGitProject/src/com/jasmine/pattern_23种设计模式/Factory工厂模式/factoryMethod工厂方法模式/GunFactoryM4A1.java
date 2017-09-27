package com.jasmine.pattern_23种设计模式.Factory工厂模式.factoryMethod工厂方法模式;

import com.jasmine.pattern_23种设计模式.Factory工厂模式._baseClass基础类.M4A1;

public class GunFactoryM4A1 implements GunFactoryMethod{
	@Override
	public M4A1 getGun() {
		return new M4A1();
	}
}
