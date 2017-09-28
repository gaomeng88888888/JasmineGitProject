package com.jasmine.pattern_23种设计模式.singleton单例模式.lazySignleton懒汉式单例;

/**
 * 以下懒汉式单例的实现没有考虑“线程安全问题”，它是线程不安全的，并发环境下很可能出现多个Singleton实例，
 * 要实现线程安全，有以下三种方式，都是对getInstance这个方法改造，保证了懒汉式单例的线程安全
 * {@link LazySingletonSynchronized}----在getInstance方法加synchronized
 * {@link LazySingletonHolder}
 * {@link}
 */
public class LazySingleton {
	private static LazySingleton lazySingleton;

	public LazySingleton getInstance() {
		if (lazySingleton == null)
			lazySingleton = new LazySingleton();
		return lazySingleton;
	}
}