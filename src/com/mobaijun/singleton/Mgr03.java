package com.mobaijun.singleton;

/**
 * Software：IntelliJ IDEA 2018.2.4 x64
 * Author: MoBai·杰
 * Date: 2020/5/12 9:46
 * ClassName:Mgr03
 * 类描述：懒汉式
 * 优点: 可以按需调用
 * 缺点: 线程不安全
 */
public class Mgr03 {

	private static volatile Mgr03 INSTANCE;

	private Mgr03() {
	}

	public static Mgr03 getInstance() {
		if (INSTANCE == null) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			INSTANCE = new Mgr03();
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
					System.out.println(Mgr03.getInstance().hashCode())
			).start();
		}
	}
}
