package com.jasmine.effectiveJava.builder模式;

import java.awt.Color;

public class NutritionFacts {
	private final int servingSize;
	private final int servings;
	private Color color;
	private String str;
	private int num;
	
	public static class Builder{
		private final int servingSize;
		private final int servings;
		private Color color = Color.blue;
		private String str = "";
		private int num = 0;
		
		public Builder(int servingSize,int servings){
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		public Builder color(Color color){ this.color = color; return this; }
		public Builder str(String str){this.str = str; return this;}
		public Builder num(int num){this.num = num; return this;}
		
		public NutritionFacts build(){return new NutritionFacts(this);}
	}
	
	private NutritionFacts(Builder builder){
		servingSize = builder.servingSize;
		servings = builder.servings;
		color = builder.color;
		str = builder.str;
		num = builder.num;
	}
}
