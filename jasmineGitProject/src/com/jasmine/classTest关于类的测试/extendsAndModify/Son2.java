package com.jasmine.classTest关于类的测试.extendsAndModify;

public class Son2 extends AFather{
	@Override
	public String toString() {
		return "";
	}
	public String getName() {
		return super.getName();
	}
	public void setName(String name) {
		super.setName(name);
	}
}
