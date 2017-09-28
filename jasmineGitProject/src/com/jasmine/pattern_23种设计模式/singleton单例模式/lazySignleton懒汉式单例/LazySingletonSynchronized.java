package com.jasmine.pattern_23种设计模式.singleton单例模式.lazySignleton懒汉式单例;

public class LazySingletonSynchronized {
	private LazySingletonSynchronized lazySingletonSynchronized = null;

	public synchronized LazySingletonSynchronized getInstance() {
		if (lazySingletonSynchronized != null)
			lazySingletonSynchronized = new LazySingletonSynchronized();
		return lazySingletonSynchronized;
	}
}
