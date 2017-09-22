package com.jasmine.string;

public class StringAppendTime {
	public static void main(String[] args) {
		final int TIMES = 100;
		int i;
		
		long startStr = System.nanoTime();
		String str = "";
		for(i=0;i<TIMES;++i){
			str += i;
		}
		long endStr = System.nanoTime();
		System.out.println("str:"+(endStr-startStr));
		/*
		 * TIMES=3结果6w+
		 * TIMES=100结果17w+
		 */
	}
}
