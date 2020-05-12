package com.mobaijun.strategy;


/**
 * Software：IntelliJ IDEA 2018.2.4 x64
 * Author: MoBai·杰
 * Date: 2020/5/12 15:28
 * ClassName:Sorter
 * 类描述：排序算法
 */
public class Sorter<E> {

	public void sort(E[] arr, Comparator<E> comparator) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minPos = i;
			for (int j = i + 1; j < arr.length; j++) {
				minPos = comparator.compare(arr[j], arr[minPos]) == -1 ? j : minPos;
			}
			swap(arr, i, minPos);
		}
	}

	private void swap(E[] arr, int i, int j) {
		E temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
