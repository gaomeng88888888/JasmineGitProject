package com.jasmine.reflex.classReflexForSetFinalValue;

public final class ClassReflex {
	//这里的str不能直接赋值"×××××"
	private final String strFinal = new String("×××××");
	private final Integer numFinal = 2;
	private final int intFinal = 5;
	private Integer num;
	private String str;
	@Override
	public String toString() {
		return "Class1 [numFinal=" + strFinal + ", num=" + num + ", str=" + str + "]";
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public String getStrFinal() {
		return strFinal;
	}
	public Integer getNumFinal() {
		return numFinal;
	}
	public int getIntFinal(){
		return intFinal;
	}
	public void method1(){ 
		System.out.println("method1");
	}
	public void method2(){ 
		System.out.println("method2");
	}
	public void method3(){ 
		System.out.println("method3");
	}
}
