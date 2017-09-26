package com.jasmine;

public class Test {

	public static void main(String[] args) {
		int[] num = { 0, 0, -1 };
		System.out.println(longestConsecutive(num));
	}

	public static int longestConsecutive(int[] num) {
		// write your code here
		int maxLength = 1;
		int maxLengthTemp = 1;
		int tempNum = num[0];
		heapSort(num);
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

	public static void printArray(int[] array) {
		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
	}

	public static void heapSort(int[] array) {
		if (array == null || array.length <= 1)
			return;

		buildMaxHeap(array);

		for (int i = array.length - 1; i >= 1; i--) {
			exchangeElements(array, 0, i);
			maxHeap(array, i, 0);
		}
	}

	private static void buildMaxHeap(int[] array) {
		if (array == null || array.length <= 1)
			return;

		int half = array.length / 2;
		for (int i = half; i >= 0; i--) {
			maxHeap(array, array.length, i);
		}
	}

	private static void maxHeap(int[] array, int heapSize, int index) {
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

	public static void exchangeElements(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
}
