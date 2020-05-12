package com.mobaijun.strategy;


/**
 * Software：IntelliJ IDEA 2018.2.4 x64
 * Author: MoBai·杰
 * Date: 2020/5/12 15:36
 * ClassName:Cat
 * 类描述：猫
 */
public class Cat implements Comparable<Cat> {

	int weight, height;

	// 构造器
	public Cat(int weight, int height) {
		this.weight = weight;
		this.height = height;
	}

	public int compareTo(Cat c) {
		if (this.weight < c.weight) return -1;
		else if (this.weight > c.weight) return 1;
		else return 0;
	}

	@Override
	public String toString() {
		return "Cat{" +
				"weight=" + weight +
				", height=" + height +
				'}';
	}
}
