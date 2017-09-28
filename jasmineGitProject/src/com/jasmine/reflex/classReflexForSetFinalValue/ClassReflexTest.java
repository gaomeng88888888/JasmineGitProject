package com.jasmine.reflex.classReflexForSetFinalValue;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ClassReflexTest {
	public static void main (String[] args) throws IllegalArgumentException, IllegalAccessException, ClassNotFoundException {
//		class1_1这样的对象不推荐使用反射，或者就不能用反射
//		Class<?> class1_1 = Class.forName("com.jasmine.reflex.ClassReflex");
		
		Integer iFinal = 1;
		iFinal++;
		
		ClassReflex class1_2 = new ClassReflex();
		class1_2.setNum(987);
		class1_2.setStr("围观");
		System.out.println("start:"+class1_2);
		Field[] fields = class1_2.getClass().getDeclaredFields();
		for(Field f : fields){
			if(Modifier.isStatic(f.getModifiers())){
				continue;
			}
			if(Modifier.isFinal(f.getModifiers())){
				f.setAccessible(true);
				System.out.print(f.getName() + ":" + f.get(class1_2));
				
				if(f.get(class1_2) instanceof String) f.set(class1_2, new String("√√√√√"));
				System.out.println(" -> " + f.get(class1_2));
				System.out.println("middle:" + class1_2);
				continue;
			}
//			f.getName()----属性名
//			f.getGenericType()----数据类型
//			f.get(对象)----获取属性值----要有f.setAccessible(true);支持
//			f.set(对象)----设置属性值----要有f.setAccessible(true);支持
//			f.setAccessible(true);
//			System.out.print(f.getName()+":"+f.get(class1_2));
//			if(f.get(class1_2) instanceof Integer) f.set(class1_2, 9);
//			System.out.println("->"+f.get(class1_2));
		}
		System.out.println("end:"+class1_2);
	}
}
