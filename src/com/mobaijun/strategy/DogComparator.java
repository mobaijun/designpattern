package com.mobaijun.strategy;

/**
 * Software：IntelliJ IDEA 2018.2.4 x64
 * Author: MoBai·杰
 * Date: 2020/5/12 16:46
 * ClassName:DogComparator
 * 类描述：比较器
 */
public class DogComparator implements Comparator<Dog> {
	@Override
	public int compare(Dog o1, Dog o2) {
		if (o1.foot < o2.foot) return -1;
		else if (o1.foot > o2.foot) return 1;
		else return 0;
	}
}
