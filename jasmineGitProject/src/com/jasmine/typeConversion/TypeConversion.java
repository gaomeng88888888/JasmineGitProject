package com.jasmine.typeConversion;

import org.junit.Test;

/**
 * 
 * @author gaomeng
 * @date Sep 25, 2017 1:48:40 PM 
 * @version V1.0
 */
public class TypeConversion {
	
	/*
	 * 编译器报错：
	 * java.lang.Error: Unresolved compilation problem:
	 * Type mismatch: cannot convert from int to short
	 * 
	 * 当short+1的时候返回值转换为int，再次赋值给s的时候发生short to int类型转换失败
	 */
	@Test
	public void shortToInt(){
		short s = 1;
//		s = s + 1;
	}
	
	
}
