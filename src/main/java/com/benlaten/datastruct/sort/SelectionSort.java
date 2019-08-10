package com.benlaten.datastruct.sort;

/**
 * 选择排序 <br>
 * 依次获取每次最小的元素，和冒泡算法原理区别是不是相邻比较，而是一个和剩下所有的比较
 * 
 * @author benlaten
 *
 */
public class SelectionSort {

	public static void doSort(int a[]) {
		int temp = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
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
