package com.jasmine.reflex.lvtianhao吕天浩;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
class MyInteger{
	final private int i;
	public MyInteger(int i){ this.i = i; }
	public int get(){ return i; }
	@Override public String toString() { return "MyInteger [i=" + i + "]"; }
}
public class sf {
	private final MyInteger myInteger = new MyInteger(10);
	public sf(){ }
	public int get(){ return myInteger.get(); }
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException{
		sf c = new sf();
		System.out.println("start:"+c.toString());
		Field[] fields = c.getClass().getDeclaredFields();
		for(Field f : fields){
			f.setAccessible(true);
			if(Modifier.isFinal(f.getModifiers())){
				if(f.getName().equals("myInteger")) {
					MyInteger cla = (MyInteger) f.get(c);
					System.out.println("cla:"+cla.toString());
					Field[] fields2 = cla.getClass().getDeclaredFields();
					for(Field ff : fields2){
						ff.setAccessible(true);
						if(Modifier.isFinal(ff.getModifiers())){
							System.out.println(ff);
							ff.set(cla, 123);
						}
						else System.err.println("ff-no");
					}
				}
				else System.err.println("f-no");
			}
		}
		System.out.println("end:"+c.toString());
	}
	@Override public String toString() { return "sf [myInteger=" + myInteger + "]"; }
}
