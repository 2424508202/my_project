package com.imooc.proxy;
/*
 * 通过继承方式
 */
public class Car2 extends Car {

	@Override
	public void move() {
		long starttime=System.currentTimeMillis();
		System.out.println("汽车开始行驶。。。");
		super.move();
		long endtime=System.currentTimeMillis();
		System.out.println("汽车结束行驶。。。"+"用时："+
		(endtime-starttime)+"毫秒");
	}
	
}
