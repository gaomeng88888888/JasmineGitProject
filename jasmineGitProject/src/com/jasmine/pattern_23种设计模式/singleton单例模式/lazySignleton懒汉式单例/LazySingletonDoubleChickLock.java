package com.jasmine.pattern_23种设计模式.singleton单例模式.lazySignleton懒汉式单例;

public class LazySingletonDoubleChickLock {
	private LazySingletonDoubleChickLock lazySingletonDoubleChickLock = null;

	public LazySingletonDoubleChickLock getInstance() {
		if (lazySingletonDoubleChickLock != null) {
			synchronized (lazySingletonDoubleChickLock) {
				lazySingletonDoubleChickLock = new LazySingletonDoubleChickLock();
			}
		}
		return lazySingletonDoubleChickLock;
	}
}
