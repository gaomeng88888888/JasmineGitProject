package com.jasmine.pattern_23种设计模式.Factory工厂模式.factoryMethod工厂方法模式;

import com.jasmine.pattern_23种设计模式.Factory工厂模式._baseClass基础类.AK47;
import com.jasmine.pattern_23种设计模式.Factory工厂模式._baseClass基础类.M4A1;

/**
 * 工厂方法模式仿佛已经很完美的对对象的创建进行了包装，使得客户程序中仅仅处理抽象产品角色提供的接口，但使得对象的数量成倍增长。
 * 当产品种类非常多时，会出现大量的与之对应的工厂对象，这不是我们所希望的。
 */

public class FactoryMethodTest {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		GunFactoryAK47 gunFactoryAK47 = new GunFactoryAK47();
		AK47 ak47 = gunFactoryAK47.getGun();
		GunFactoryM4A1 gunFactoryM4A1 = new GunFactoryM4A1();
		M4A1 m4a1 = gunFactoryM4A1.getGun();
	}
}
