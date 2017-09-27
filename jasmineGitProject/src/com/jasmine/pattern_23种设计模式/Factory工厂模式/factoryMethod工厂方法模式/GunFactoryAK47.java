package com.jasmine.pattern_23种设计模式.Factory工厂模式.factoryMethod工厂方法模式;

import com.jasmine.pattern_23种设计模式.Factory工厂模式._baseClass基础类.AK47;

public class GunFactoryAK47 implements GunFactoryMethod {
	@Override
	public AK47 getGun() {
		return new AK47();
	}
}
