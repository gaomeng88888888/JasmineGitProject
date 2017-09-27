package com.jasmine.pattern_23种设计模式.Factory工厂模式.abstractFactory抽象工厂模式;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		AbstractFactory abstractFactoryAK47 = new AbstractFactoryAK47();
		abstractFactoryAK47.getBullet();
		abstractFactoryAK47.getGunsight();

		AbstractFactory abstractFactoryM4A1 = new AbstractFactoryM4A1();
		abstractFactoryM4A1.getBullet();
		abstractFactoryM4A1.getGunsight();
	}
}
