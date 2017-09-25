package com.jasmine.algorithm算法问题;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 约瑟夫环原理：
 * 约瑟夫环（约瑟夫问题）是一个数学的应用问题：
 * 	已知n个人（以编号1，2，3...n分别表示）围坐在一张圆桌周围。从编号为k的人开始报数，数到m的那个人出列；
 * 	他的下一个人又从1开始报数，数到m的那个人又出列；依此规律重复下去，直到圆桌周围的人全部出列。
 * 	通常解决这类问题时我们把编号从0~n-1，最后结果+1即为原问题的解。
 * */

/**
 * 约瑟夫环运作如下：
 * 1、一群人围在一起坐成环状（如：N）
 * 2、从某个编号开始报数（如：K）
 * 3、数到某个数（如：M）的时候，此人出列，下一个人重新报数
 * 4、一直循环，直到所有人出列，约瑟夫环结束
 * */

/**
 * 相关
 * 百度百科（约瑟夫问题）：https://baike.baidu.com/item/%E7%BA%A6%E7%91%9F%E5%A4%AB%E9%97%AE%E9%A2%98
 * 百度百科（约瑟夫环）：https://baike.baidu.com/item/%E7%BA%A6%E7%91%9F%E5%A4%AB%E7%8E%AF/348830?fr=aladdin#reference-[2]-717633-wrap
 * */

public class JosephProblem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入总人数：");
		int totalNum = scanner.nextInt();
		System.out.print("请输入报数的大小：");
		int cycleNum = scanner.nextInt();
		System.out.print("请输入开始编号：");
		int startNO = scanner.nextInt();
		yuesefu(totalNum, cycleNum, startNO);
//		yuesefu(5, 2, 3);
	}

	public static void yuesefu(int totalNum, int countNum, int startNO) {
		// 初始化人数
		List<Integer> start = new ArrayList<Integer>();
		for (int i = 1; i <= totalNum; i++) {
			start.add(i);
		}
		// 从下标为K开始计数
		int k = startNO - 1;
		while (start.size() > 0) {
			System.out.println(start);
			// 第m人的索引位置
			k = (k + countNum) % (start.size()) - 1;
			// 判断是否到队尾 到队尾时候k=-1
			if (k < 0) {
				System.out.println(start.get(start.size() - 1));
				start.remove(start.size() - 1);
				k = 0;
			} else {
				System.out.println(start.get(k));
				start.remove(k);
			}
		}
	}
}
// 结果：
// [1, 2, 3, 4, 5]
// 4
// [1, 2, 3, 5]
// 1
// [2, 3, 5]
// 3
// [2, 5]
// 2
// [5]
// 5