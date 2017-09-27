package com.jasmine.pattern_23种设计模式.Factory工厂模式._baseClass基础类;

public enum GunType {
	AK47("ak47", 1), M4A1("m4a1", 2);
	public String name;
	int num;

	private GunType(String name, int num) {
		this.name = name;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return name + num;
	}
}
