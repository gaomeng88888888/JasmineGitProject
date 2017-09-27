package com.jasmine.pattern_23种设计模式.Factory工厂模式.abstractFactory抽象工厂模式;

import com.jasmine.pattern_23种设计模式.Factory工厂模式.abstractFactory抽象工厂模式._baseClassExtend基础类扩展.Bullet;
import com.jasmine.pattern_23种设计模式.Factory工厂模式.abstractFactory抽象工厂模式._baseClassExtend基础类扩展.Gunsight;

public interface AbstractFactory {
	public Bullet getBullet();

	public Gunsight getGunsight();
}
