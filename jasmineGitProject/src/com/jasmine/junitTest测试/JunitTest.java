package com.jasmine.junitTest测试;

import java.util.Scanner;
import org.junit.Test;

public class JunitTest {
	@Test
	public void t1() {
		int charArrayLength = 0;
		Scanner sc = new Scanner(System.in);
		charArrayLength = sc.nextInt();
		char[] charArray = new char[charArrayLength];
		for (int i = 0; i < charArrayLength; ++i) {

		}
		System.out.println("length=" + charArray.length);
	}

	@Test
	public void t2() {
		
	}
}
