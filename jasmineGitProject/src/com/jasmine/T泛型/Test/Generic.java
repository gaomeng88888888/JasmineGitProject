package com.jasmine.T泛型.Test;

public class Generic {
	public <T> T getObject(Class<T> c) throws InstantiationException, IllegalAccessException {
		T t = c.newInstance();
		return t;
	}
}
