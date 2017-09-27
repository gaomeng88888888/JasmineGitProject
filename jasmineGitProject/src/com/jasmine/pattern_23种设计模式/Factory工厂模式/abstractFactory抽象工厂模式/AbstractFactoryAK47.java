package com.jasmine.pattern_23种设计模式.Factory工厂模式.abstractFactory抽象工厂模式;

import com.jasmine.pattern_23种设计模式.Factory工厂模式.abstractFactory抽象工厂模式._baseClassExtend基础类扩展.Bullet;
import com.jasmine.pattern_23种设计模式.Factory工厂模式.abstractFactory抽象工厂模式._baseClassExtend基础类扩展.BulletAK47;
import com.jasmine.pattern_23种设计模式.Factory工厂模式.abstractFactory抽象工厂模式._baseClassExtend基础类扩展.Gunsight;
import com.jasmine.pattern_23种设计模式.Factory工厂模式.abstractFactory抽象工厂模式._baseClassExtend基础类扩展.GunsightAK47;

/**
 * 抽象工厂模式是工厂方法模式的升级版本，他用来创建一组相关或者相互依赖的对象。
 */

public class AbstractFactoryAK47 implements AbstractFactory {

	@Override
	public Bullet getBullet() {
		return new BulletAK47();
	}

	@Override
	public Gunsight getGunsight() {
		return new GunsightAK47();
	}

}
