package com.mobaijun.singleton;

/**
 * Software：IntelliJ IDEA 2018.2.4 x64
 * Author: MoBai·杰
 * Date: 2020/5/12 9:42
 * ClassName:Mgr02
 * 类描述：
 */
public class Mgr02 {
	private static final Mgr02 INSTANCE;

	static {
		INSTANCE = new Mgr02();
	}

	private Mgr02() {

	}

	public static Mgr02 getInstance() {
		return INSTANCE;
	}

	public void m() {
		System.out.println("m");
	}

	public static void main(String[] args) {
		Mgr02 m1 = Mgr02.getInstance();
		Mgr02 m2 = Mgr02.getInstance();
		System.out.println(m1.equals(m2));
	}
}
