package com.jasmine.variables变量;

public class VariableValue {
	public static void main(String[] args) {
		Long multiplyStartTime = System.nanoTime();
		for(long i=0;i<100000;++i){
			long l = 1*2*3*4*5*6*7*8*9*18*324*7897*7897*8787;
			if(l==1);
		}
		Long commenStartTime = System.nanoTime();
		for(long i=0;i<100000;++i){
			long l = 2116316160L;
			if(l==1);
		}
		long multiplyTime = commenStartTime-multiplyStartTime;
		long commenTime = System.nanoTime()-commenStartTime;
		System.out.println("��:" + multiplyTime);
		System.out.println("�ǳ�:" + commenTime);
		System.out.println("��-�ǳ�:" + (multiplyTime-commenTime));
	}
}
/*
	��:2006697
	�ǳ�:1952268
	��-�ǳ�:54429
	
	��:2003276
	�ǳ�:1958178
	��-�ǳ�:45098

	��:1960977
	�ǳ�:2045263
	��-�ǳ�:-84286
*/
