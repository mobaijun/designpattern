package com.mobaijun.singleton;

/**
 * Software：IntelliJ IDEA 2018.2.4 x64
 * Author: MoBai·杰
 * Date: 2020/5/12 10:21
 * InterfaceName:Mgr08
 * 枚举类描述：单例
 * 不仅可以解决线程同步,还可以防止反序列化
 */
public enum Mgr08 {

	INSTANCE;

	public void m() {

	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new Thread(() ->
					System.out.println(Mgr08.INSTANCE.hashCode())
			).start();
		}
	}
}
