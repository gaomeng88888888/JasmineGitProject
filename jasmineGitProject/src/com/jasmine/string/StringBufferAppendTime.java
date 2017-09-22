package com.jasmine.string;

public class StringBufferAppendTime {
	public static void main(String[] args) {
		final int TIMES = 100;
		int i;
		
		long startStrBuf = System.nanoTime();
		StringBuffer strbuf = new StringBuffer("");
		for(i=0;i<TIMES;++i){
			strbuf.append(i);
		}
		strbuf.toString();
		long endStrBuf = System.nanoTime();
		System.out.println("strbuf:"+(endStrBuf-startStrBuf));
		/*
		 * TIMES=3结果基本是5w5，不稳定，有时候是7w、8w
		 * TIMES=100结果8w+
		 */
	}
}
