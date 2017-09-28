package com.jasmine.pattern_23种设计模式.singleton单例模式.hungrySingleton饿汉式单例;

//缺点是没有达到lazy loading的效果
public class HungrySingleton {
	private static HungrySingleton hungrySingleton = new HungrySingleton();
	public HungrySingleton getInstance(){
		return hungrySingleton;
	}
}
