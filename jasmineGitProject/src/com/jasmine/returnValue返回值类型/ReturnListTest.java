package com.jasmine.returnValue返回值类型;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReturnListTest {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ReturnListTest returnListTest = new ReturnListTest();
//		//java.lang.NullPointerException
//		for(String s:returnListTest.returnNull()){
//			System.out.println("null!");
//		}
		//
		for(String s:returnListTest.returnEmptyList()){
			System.out.println("Empty!");
		}
		//
		for(String s:returnListTest.returnNewList()){
			System.out.println("New");
		}
	}
	
	public List<String> returnNull(){
		List<String> list = null;
		return list;
	}
	
	public List<String> returnEmptyList(){
		List<String> list = Collections.emptyList();
		//java.lang.UnsupportedOperationException
		//list.add("");
		return list;
	}
	
	public List<String> returnNewList(){
		List<String> list = new ArrayList<String>();
		System.out.println(list.size());
		return list;
	}
}
