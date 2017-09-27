package com.jasmine.pattern_23种设计模式.Factory工厂模式.abstractFactory抽象工厂模式;

import com.jasmine.pattern_23种设计模式.Factory工厂模式.abstractFactory抽象工厂模式._baseClassExtend基础类扩展.Bullet;
import com.jasmine.pattern_23种设计模式.Factory工厂模式.abstractFactory抽象工厂模式._baseClassExtend基础类扩展.BulletM4A1;
import com.jasmine.pattern_23种设计模式.Factory工厂模式.abstractFactory抽象工厂模式._baseClassExtend基础类扩展.Gunsight;
import com.jasmine.pattern_23种设计模式.Factory工厂模式.abstractFactory抽象工厂模式._baseClassExtend基础类扩展.GunsightM4A1;

public class AbstractFactoryM4A1 implements AbstractFactory{

	@Override
	public Bullet getBullet() {
		return new BulletM4A1();
	}

	@Override
	public Gunsight getGunsight() {
		return new GunsightM4A1();
	}

}
