package com.jasmine.algorithm算法问题;

/**
 * 技术点：数组、排序
 * 要求你的算法复杂度为O(n)
 * 给出数组[100, 4, 200, 1, 3, 2]，这个最长的连续序列是 [1, 2, 3, 4]，返回所求长度 4
 * */

public class LongestContinuousSequenceTest {
	public static void main(String[] args) {
		int[] arr1 = {0};
		int[] arr2 = {0, 0, -1};
		int[] arr3 = {1, 2, 1, 0};
		int[] arr4 = {2, 5, 3, 4, -1, 0};
		System.out.println(new LongestContinuousSequence().longestConsecutive(arr3));
	}
}

class LongestContinuousSequence {

	public int longestConsecutive(int[] num) {
		int maxLength = 1;
		int maxLengthTemp = 1;
		heapSort(num);
		int tempNum = num[0];
		for (int i = 1; i < num.length; ++i) {
			if(tempNum == num[i])
				continue;
			if (tempNum == num[i] - 1)
				++maxLengthTemp;
			else
				maxLengthTemp = 1;
			if (maxLength < maxLengthTemp)
				maxLength = maxLengthTemp;
			tempNum = num[i];
		}
		return maxLength;
	}

	public void printArray(int[] array) {
		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
	}

	public void heapSort(int[] array) {
		if (array == null || array.length <= 1)
			return;

		buildMaxHeap(array);

		for (int i = array.length - 1; i >= 1; i--) {
			exchangeElements(array, 0, i);
			maxHeap(array, i, 0);
		}
	}

	private void buildMaxHeap(int[] array) {
		if (array == null || array.length <= 1)
			return;

		int half = array.length / 2;
		for (int i = half; i >= 0; i--) {
			maxHeap(array, array.length, i);
		}
	}

	private void maxHeap(int[] array, int heapSize, int index) {
		int left = index * 2 + 1;
		int right = index * 2 + 2;
		int largest = index;
		if (left < heapSize && array[left] > array[index])
			largest = left;
		if (right < heapSize && array[right] > array[largest])
			largest = right;
		if (index != largest) {
			exchangeElements(array, index, largest);
			maxHeap(array, heapSize, largest);
		}
	}

	public void exchangeElements(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
}
