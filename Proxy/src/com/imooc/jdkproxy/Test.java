package com.imooc.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.imooc.proxy.Car;
import com.imooc.proxy.Moveable;

public class Test {
	/*
	 * 动态代理测试类
	 */
	public static void main(String[] args) {
		Car car=new Car();
		InvocationHandler h=new TimeHandler(car);
		ClassLoader loader=car.getClass().getClassLoader();
		Class[] interfaces=car.getClass().getInterfaces();
		/*
		 * loader：被代理类的类加载器
		 * interfaces：实现的接口
		 * h：InvocationHandler实现
		 */
		Moveable m=(Moveable) Proxy.newProxyInstance(loader, interfaces, h);
		m.move();
	}
}
