package com.mobaijun.strategy;

import java.util.Arrays;

/**
 * Software：IntelliJ IDEA 2018.2.4 x64
 * Author: MoBai·杰
 * Date: 2020/5/12 15:31
 * ClassName:Main
 * 类描述：
 */
public class Main {
	public static void main(String[] args) {
		// 创建Cat数组数组
		// Dog[] a = {new Dog(1),
		// 		new Dog(5),
		// 		new Dog(10),
		// 		new Dog(8),
		// 		new Dog(9),
		// 		new Dog(4)
		// };
		Cat[] a = {new Cat(5, 5),
				new Cat(9, 9),
				new Cat(2, 2),
				new Cat(1, 1)
		};
		// 创建排序类
		Sorter<Cat> sorter = new Sorter<>();
		// 调用排序方法
		sorter.sort(a, new CatComparator());
		// 调用Arrays.toString(a)打印数组
		System.out.println(Arrays.toString(a));
	}
}
