package com.jasmine.T泛型;

import java.util.ArrayList;

public class TTest {
//	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
//		list.add("string");
//		list.add(8);
//		for(int i=0;i<list.size();++i){
//			String s = (String) list.get(i);
//			System.out.println(s);
//		}
//	}
	@SuppressWarnings (value={"rawtypes"})
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		ArrayList arraylist = new ArrayList<>();
		System.out.println(strList.getClass() == arraylist.getClass());
	}
}