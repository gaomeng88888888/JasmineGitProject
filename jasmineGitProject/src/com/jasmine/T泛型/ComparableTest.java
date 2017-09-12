package com.jasmine.T泛型;

public class ComparableTest {
	public static void main(String[] args) {
		ComparableTest comparableTest = new ComparableTest();
		System.out.printf("Max of [%d,%d,%d] is %d\n",1,2,3,comparableTest.comparables(1, 2, 3));
		System.out.printf("Max of [%.1f,%.1f,%.1f] is %.1f\n",0.2, 2.2, -9.9,comparableTest.comparables(0.2, 2.2, -9.9));
		System.out.printf("Max of [\"%s\",\"%s\",\"%s\"] is \"%s\"\n","ddw", "2dfsa", "/wdq",comparableTest.comparables("ddw", "2dfsa", "/wdq"));
//		像下面那样的情况就是不允许的，会引起泛型类型不匹配
//		System.out.println(comparableTest.comparables(1,9.9,"w"));
	}
	
	@SuppressWarnings("unchecked")
	public <T extends Comparable<? super T>> T comparables(T...params){
		if(params==null) return null;
		T max = params[0];
		for(int i=1;i<params.length;++i){
			max = max.compareTo(params[i])>0?max:params[i];
		}
		return max;
	}

//	public <T extends Comparable<T>> T comparablesOther(T x,T y,T z){
//		return (x.compareTo(y)>0?x:y).compareTo(z)>0?(x.compareTo(y)>0?x:y):z;
//	}
}