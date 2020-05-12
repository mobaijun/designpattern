package com.mobaijun.singleton;

/**
 * Software：IntelliJ IDEA 2018.2.4 x64
 * Author: MoBai·杰
 * Date: 2020/5/12 9:46
 * ClassName:Mgr03
 * 类描述：懒汉式
 * 最完美的写法
 * 使用静态内部类方式,JVM保证单例
 * 加载外部类时不会加载内部类,可以实现懒加载
 */
// 外部类
public class Mgr07 {


	// 私有构造方法
	private Mgr07() {
	}

	// 内部类
	private static class Mgr07Holder {
		private final static Mgr07 INSTANCE = new Mgr07();
	}

	// 调用Mgr07Holder.INSTANCE
	public static Mgr07 getInstance() {
		return Mgr07Holder.INSTANCE;
	}

	public void m() {
		System.out.println("m");
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new Thread(() ->
					System.out.println(Mgr07.getInstance().hashCode())
			).start();
		}
	}
}
