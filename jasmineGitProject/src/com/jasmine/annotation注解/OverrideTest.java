package com.jasmine.annotation注解;

public class OverrideTest {
	
	public interface Person{
		public int num = 0;
		public void methodTest();
	}
	public class Father implements Person{
		@Override public void methodTest(){}
	}
	public class Son extends Father{
		@Override public void methodTest(){}
	}
	public class Son2 extends Father{
		@Override public void methodTest(){}
	}
	public class Father2 implements Person{
		@Override public void methodTest(){}
	}

	public abstract class FatherAbstract implements Person{}
	public abstract class FatherAbstract2 implements Person{
		@Override public void methodTest(){}
	}
	public abstract class SonAbstract extends FatherAbstract{}
	public class Father3 extends FatherAbstract{
		@Override public void methodTest(){}
	}
	public class Son3 extends SonAbstract{
		@Override public void methodTest(){}
	}
}
