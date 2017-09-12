package com.jasmine.classTest关于类的测试;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class NewArrayListEquals {
	@Test
	public void newArrayListClass(){
		System.out.println("***************************newArrayListClass()***************************");
		Class<?> c1 = new ArrayList<String>().getClass();
		Class<?> c2 = new ArrayList<Integer>().getClass();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1==c2);
	}
	
	@Test
	public void newArrayList(){
		System.out.println("***************************newArrayList()***************************");
		List<String> l1 = new ArrayList<String>();
		List<String> l2 = new ArrayList<String>();
		System.out.println(l1);
		System.out.println(l2);
		l1.add("8");l1.add("");l1.add("_");l1.add("g");
		l2.add("");l2.add("_");
		System.out.println(l1.equals(l2));
		System.out.println(l1.containsAll(l2));
	}
	
	@Test
	public void NewMap(){
		System.out.println("***************************NewMap()***************************");
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		System.out.println(map1==map2);
		map1.put(1, "value1");map1.put(2, "value2");map1.get(1);
		map2.put(2, "value2");map2.put(1, "value1");map2.get(1);
		System.out.println(map1.toString());
		System.out.println(map1.toString());
		System.out.println(map1==map2);
	}
}
