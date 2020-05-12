package com.mobaijun.singleton;


/**
 * Software：IntelliJ IDEA 2018.2.4 x64
 * Author: MoBai·杰
 * Date: 2020/5/12 9:28
 * ClassName:Demo1
 * 类描述：饿汉式
 * 类加载到内存后,就实例化一个单例,JVM保证线程安全
 * 优点:简单实用,推荐使用
 * 缺点:不管用不用,类加载时都会完成实例化
 */
public class Mgr01 {

	private static final Mgr01 INSTANCE = new Mgr01();

	private Mgr01() {

	}

	public static Mgr01 getInstance() {
		return INSTANCE;
	}

	public void m() {
		System.out.println("m");
	}

	// 主方法
	public static void main(String[] args) {
		Mgr01 m1 = Mgr01.getInstance();
		Mgr01 m2 = Mgr01.getInstance();
		System.out.println(m1 == m2);
	}
}
