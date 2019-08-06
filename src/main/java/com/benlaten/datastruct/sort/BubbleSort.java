package com.benlaten.datastruct.sort;

/**
 * 冒泡排序 排序原理：进行N-1次比较，其中N为数组的长度<b> 
 * 每次从0开始对相邻的数据进行比较，将较小者交换到左边
 * 
 * @author benlaten
 *
 */
public class BubbleSort {

	public static void doSort(int a[]) {
		int times = a.length - 1;
		int temp = 0;
		for (int i = 1; i <= times; i++) {
			for (int j = a.length - 1; j > 0; j--) {
				if (a[j] < a[j - 1]) {
					temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;

				}
			}

		}
	}

	public static void main(String[] args) {
		int a[] = { 7, 2, 5, 18, 13, 22, 6, 12, 16, 8 };
		doSort(a);
		for (int temp : a) {
			System.out.print(temp + ",");
		}
	}

}
