package com.jasmine.pattern_23种设计模式.Factory工厂模式.simpleFactory简单工厂模式;

import com.jasmine.pattern_23种设计模式.Factory工厂模式._baseClass基础类.AK47;
import com.jasmine.pattern_23种设计模式.Factory工厂模式._baseClass基础类.Gun;
import com.jasmine.pattern_23种设计模式.Factory工厂模式._baseClass基础类.GunType;
import com.jasmine.pattern_23种设计模式.Factory工厂模式._baseClass基础类.M4A1;

public class GunFactory {
	public Gun getGun(GunType gunType){
		Gun gun = null;
		switch(gunType){
		case AK47:
			gun = new AK47();
			break;
		case M4A1:
			gun = new M4A1();
			break;
		default:
			//这里便于代码运行使用syso，优化的时候可以改为throw XxxException
			System.out.println("");
		}
		return gun;
	}
}
