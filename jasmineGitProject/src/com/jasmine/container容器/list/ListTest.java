package com.jasmine.container容器.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<Boolean> l = new ArrayList<Boolean>(4);
		for(int i=0;i<100;++i){
			l.add(true);
		}
	}
}
