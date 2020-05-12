package com.mobaijun.singleton;

/**
 * Software：IntelliJ IDEA 2018.2.4 x64
 * Author: MoBai·杰
 * Date: 2020/5/12 9:46
 * ClassName:Mgr03
 * 类描述：懒汉式
 * 优点: 可以按需调用
 * 缺点: 线程不安全
 * 解决方案: 添加synchronized
 * 新缺点: 添加synchronized后线程效率会降低
 */
public class Mgr06 {

	// volatile解决指令重排的问题
	private static volatile Mgr06 INSTANCE;

	private Mgr06() {
	}

	public static Mgr06 getInstance() {
		if (INSTANCE == null) {
			// 双重检查
			synchronized (Mgr06.class) {
				if (INSTANCE == null) {
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					INSTANCE = new Mgr06();
				}
			}
		}
		return INSTANCE;
	}

	public void m() {
		System.out.println("m");
	}

	public static void main(String[] args) {

		long l = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			new Thread(() ->
					System.out.println(Mgr06.getInstance().hashCode())
			).start();
		}
		long l1 = System.currentTimeMillis();
		System.out.println((l1 - l));
	}
}
