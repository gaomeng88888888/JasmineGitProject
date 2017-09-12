package com.jasmine.T泛型;

public class TTest_2 {
	public static void main(String[] args) {
		
	}
}

class Person{
	int id;
	String name;
	public int getId() { return id; }
	public void setId(int id) { this.id = id; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
}
	
interface member<T>{
	public T m1();
	public boolean m3(T t);
}

class StringClass<E> implements member<String>{
	@Override public String m1() { return ""; }
	@Override public boolean m3(String t) { return false; }
}

class PersonClass implements member<Person>{
	@Override public Person m1() { return null; }
	@Override public boolean m3(Person t) { return false; }
}

class TClass<E> implements member<E>{
	@Override public E m1() { return null; }
	@Override public boolean m3(E t) { return false; }
}

class TClass2<E> implements member<E>{
	@Override public E m1() { return null; }
	@Override public boolean m3(Object t) { return false; }
}
