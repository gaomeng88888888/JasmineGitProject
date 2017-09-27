package com.jasmine.effectiveJava.builder模式;

import java.awt.Color;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class NutritionFactsTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		NutritionFacts nutritionFacts = new NutritionFacts.Builder(123, 1).color(Color.yellow).str("").num(0).build();
		System.out.println(nutritionFacts.toString());
		//接下来从nutritionFacts对象获取其中的所有值
//		Class<?> className = nutritionFacts.getClass();
//		Object obj = Class.forName(className.getName());
		Field[] nutritionFactsValues = nutritionFacts.getClass().getDeclaredFields();
		for(Field f : nutritionFactsValues){
			if (Modifier.isStatic(f.getModifiers()) || Modifier.isFinal(f.getModifiers())) {
				System.out.println("if:"+f.getName());
				continue;
	        }
			System.out.println(f.getName());
		}
	}
}
