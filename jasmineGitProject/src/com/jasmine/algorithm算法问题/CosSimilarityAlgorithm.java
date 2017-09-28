package com.jasmine.algorithm算法问题;

import java.util.Arrays;

/**
 * 其中： LENGTH=4----每条数据长度：W的长度； index[]----保存最似数据的下标，0开始
 * num----上面那一串看不清的数据。（这个长度要大于2）
 */

public class CosSimilarityAlgorithm {
	// 数据长度 LENGTH
	private final static int LENGTH = 4;

	public static void main(String[] args) {
		System.out.println("运算开始");
		long timeStart = System.nanoTime();
		double cosResult = 0, cosResultTemp = 0;
		// 记录最近两条数据的位置
		int index[] = { -1, -1 };
		int[][] num = { { 1464, 91, 57, 225 }, { 43, 10, 5, 2 }, { 441, 81, 42, 67 }, { 1487, 3273, 746, 2679 },
				{ 64, 164, 38, 35 }, { 46, 50, 25, 14 }, { 239, 612, 315, 327 } };
		CosSimilarityAlgorithm similarity = null;
		for (int i = 0; i < num.length - 1; ++i) {
			for (int j = i + 1; j < num.length; ++j) {
				cosResultTemp = similarity(num[i], num[j]);
				// System.out.println("{" + i + "," + j + "}=" + cosResultTemp);
				if (cosResultTemp > cosResult) {
					cosResult = cosResultTemp;
					index[0] = i;
					index[1] = j;
				}
			}
		}
		long runTime = System.nanoTime() - timeStart;
		System.out.println("运算时间：" + runTime + "纳秒，即" + runTime / 1000 + "毫秒");

		System.out.println("两条最相似的数据：{" + index[0] + ":" + Arrays.toString(num[index[0]]) + "," + index[1] + ":"
				+ Arrays.toString(num[index[1]]) + "}\n余弦近似值=" + cosResult);

	}

	// 计算余弦相似度
	public static double similarity(int[]... args) {
		double numerator = numerator(args[0], args[1]);
		double denominator = denominator(args[0], args[1]);
		return numerator / denominator;
	}

	// 分子
	public static double numerator(int[] leftList, int[] rightList) {
		double numeratorResult = 0;
		for (int i = 0; i < LENGTH; ++i) {
			numeratorResult += leftList[i] * rightList[i];
		}
		return numeratorResult;
	}

	// 分母
	public static double denominator(int[] leftList, int[] rightList) {
		double leftResult = listSelf(leftList);
		double rightResult = listSelf(rightList);
		return Math.sqrt(leftResult * rightResult);
	}

	// 分母因子：膜
	public static double listSelf(int[] list) {
		double result = 0;
		for (int i = 0; i < LENGTH; ++i) {
			result += Math.pow(list[i], 2);
		}
		return result;
	}
}