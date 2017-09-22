package com.jasmine.string;

public class StringBuilderAppendTime {
	public static void main(String[] args) {
		final int TIMES = 100;
		int i;
		
		long startStrBui = System.nanoTime();
		StringBuilder strbui = new StringBuilder("");
		for(i=0;i<TIMES;++i){
			strbui.append(i);
		}
		strbui.toString();
		long endStrBui = System.nanoTime();
		System.out.println("strBui:" + (endStrBui-startStrBui));
		/*
		 * TIMES=3基本都是在5w6以下
		 * TIMES=100基本都在8w以下
		 */
	}
}
