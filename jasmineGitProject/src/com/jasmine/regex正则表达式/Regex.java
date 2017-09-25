package com.jasmine.regex正则表达式;

import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
		System.out.println(regex("", ""));
	}
	
	/**
	 * 
	 * @author jasmine
	 */
	public static boolean regex(String regex, String str){
		return Pattern.compile(regex).matcher(str).matches();
	}
	/*
	public static void regexx(){
		// 要验证的字符串
	    String str = "jwj is jwisda";
	    // 验证规则
	    String regEx = "^.*a$";
	    // 编译正则表达式
	    Pattern pattern = Pattern.compile(regEx);
	    Matcher matcher = pattern.matcher(str);
	    // 字符串是否与正则表达式相匹配
	    boolean rs = matcher.matches();
	    System.out.println(rs);
	}
	*/
}
