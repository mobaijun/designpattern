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
public class Mgr05 {

	private static Mgr05 INSTANCE;

	private Mgr05() {
	}

	public static synchronized Mgr05 getInstance() {
		if (INSTANCE == null) {
			// 试图通过添加synchronized减小同步代码块的方式提高效率,然后不可行
			synchronized (Mgr05.class) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				INSTANCE = new Mgr05();
			}
		}
		return INSTANCE;
	}

	public void m() {
		System.out.println("m");
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new Thread(() ->
					System.out.println(Mgr05.getInstance().hashCode())
			).start();
		}
	}
}
