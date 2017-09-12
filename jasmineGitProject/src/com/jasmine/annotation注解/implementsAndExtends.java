package com.jasmine.annotation注解;

public class implementsAndExtends {
	public static void main(String[] args) {
		Ttt ttt = new Ttt() { @Override public void methodT() { System.out.println("Ttt"); } };
		Cla cla = new Cla();
		Cla_ cla_ = new Cla_();
		ttt.methodT();
		cla.methodT();
		cla.methodDeprecated();
		cla_.methodT();
		cla_.methodT(0);
		cla_.methodDeprecated();
	}
}

interface Ttt{
	public void methodT();
}
class Cla implements Ttt{
	@Override public void methodT() { System.out.println("Cla"); }
	@Deprecated public void methodDeprecated(){}
}
@SuppressWarnings (value={})
class Cla_ extends Cla{
	@Override public void methodT() { System.out.println("Cla_"); }
	public void methodT(int i) { System.out.println("Cla_ int"); }
	@Override public void methodDeprecated(){}
}