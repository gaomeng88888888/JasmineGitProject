package com.jasmine.thread;

import org.junit.Test;

public class ThreadTest {
	@Test
	public void ThreadTest1() {
		for(int i=0;i<100;++i){
			new Thread(
				new Runnable() {
					public void run() {
						System.out.println(Thread.currentThread());
					}
				}
			).start();
		}
	}
}
