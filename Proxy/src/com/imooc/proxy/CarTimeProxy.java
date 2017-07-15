package com.imooc.proxy;
/*
 * 通过聚合方式将参数传递进来
 * 调用move()方法，并在前后增加业务逻辑
 */
public class CarTimeProxy implements Moveable {

	private Moveable m;
	public CarTimeProxy(Moveable m) {
		super();
		this.m = m;
	}

	@Override
	public void move() {
		long starttime=System.currentTimeMillis();
		System.out.println("汽车开始行驶。。。");
		m.move();
		long endtime=System.currentTimeMillis();
		System.out.println("汽车结束行驶。。。"+"用时："+
		(endtime-starttime)+"毫秒");
	}

}
