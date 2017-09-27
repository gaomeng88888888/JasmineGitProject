package com.jasmine.pattern_23种设计模式.Factory工厂模式.simpleFactory简单工厂模式;

import com.jasmine.pattern_23种设计模式.Factory工厂模式._baseClass基础类.AK47;
import com.jasmine.pattern_23种设计模式.Factory工厂模式._baseClass基础类.Gun;
import com.jasmine.pattern_23种设计模式.Factory工厂模式._baseClass基础类.GunType;
import com.jasmine.pattern_23种设计模式.Factory工厂模式._baseClass基础类.M4A1;

/**
 * 我们从开闭原则（对扩展开放；对修改封闭）上来分析下简单工厂模式。
 * 不再满足现有的车型号的时候，想要另一种枪，只要这种枪符合抽象产品制定的合同，那么只要通知工厂类知道就可以被客户使用了。所以对产品部分来说，它是符合开闭原则的；
 * 但是工厂部分好像不太理想，因为每增加一种新型车，都要在工厂类中增加相应的创建业务逻辑（createBMW(int type)方法需要新增case），这显然是违背开闭原则的。
 * 可想而知对于新产品的加入，工厂类是很被动的。对于这样的工厂类，我们称它为全能类或者上帝类。
 * */

public class SimpleFactoryTest {
	// 为了不让未使用变量报异常，使用下一行注解
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		GunFactory gunFactory = new GunFactory();
		Gun ak47_clone = gunFactory.getGun(GunType.AK47);
		Gun m4a1_clone = gunFactory.getGun(GunType.M4A1);
		AK47 ak47 = new AK47();
		M4A1 m4a1 = new M4A1();
	}
}
