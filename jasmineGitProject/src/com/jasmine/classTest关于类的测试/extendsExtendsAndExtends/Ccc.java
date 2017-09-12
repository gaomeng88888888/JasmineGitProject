package com.jasmine.classTest关于类的测试.extendsExtendsAndExtends;

class Ccc extends Cc implements I,Iiii{
	public void i(){
		super.i();
	}
}

class i1 implements java.lang.Iterable<Integer>{
	int iiiii = 0;
	i1(int i){
		this.iiiii = i;
	}
	class inner{
		inner(){
			++iiiii;
		}
	}
	
	public java.util.Iterator<Integer> iterator(){
		return new java.util.Iterator<Integer>(){
			public boolean hasNext(){
				return true;
			}	
			public Integer next(){
				return new Integer(43);
			}
			public void remove(){
			}
		};
	}
}


class ii1 extends i1.inner{
	static i1 o = new i1(4);

	ii1(){
		o.super();
	}
}