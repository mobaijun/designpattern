package com.mobaijun.strategy;

/**
 * Software：IntelliJ IDEA 2018.2.4 x64
 * Author: MoBai·杰
 * Date: 2020/5/12 16:06
 * ClassName:Dog
 * 类描述：狗
 */
public class Dog implements Comparable<Dog> {

	// 定义Dog属性
	int foot;

	public Dog(int foot) {
		this.foot = foot;
	}

	@Override
	public int compareTo(Dog d) {
		// 不需要强转
		if (this.foot < d.foot) return -1;
		else if (this.foot > d.foot) return 1;
		else return 0;
	}

	@Override
	public String toString() {
		return "Dog{" +
				"foot=" + foot +
				'}';
	}

}
