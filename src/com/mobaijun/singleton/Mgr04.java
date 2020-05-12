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
public class Mgr04 {

	private static Mgr04 INSTANCE;

	private Mgr04() {
	}

	public static synchronized Mgr04 getInstance() {
		if (INSTANCE == null) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			INSTANCE = new Mgr04();
		}
		return INSTANCE;
	}

	public void m() {
		System.out.println("m");
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new Thread(() ->
					// com.mobaijun.singleton.Mgr03@8ae2e7e
					// com.mobaijun.singleton.Mgr03@5372fc23
					System.out.println(Mgr04.getInstance().hashCode())
			).start();
		}
	}
}
