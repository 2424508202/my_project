package com.imooc.proxy;
/*
 * 通过聚合方式将参数传递进来
 * 调用move()方法，并在前后增加业务逻辑
 */
public class CarLogProxy implements Moveable {

	private Moveable m;
	
	public CarLogProxy(Moveable m) {
		super();
		this.m = m;
	}

	@Override
	public void move() {
		System.out.println("日志开始");
		m.move();
		System.out.println("日志结束");
	}

}
