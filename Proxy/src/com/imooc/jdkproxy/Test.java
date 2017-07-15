package com.imooc.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.imooc.proxy.Car;
import com.imooc.proxy.Moveable;

public class Test {
	/*
	 * ��̬���������
	 */
	public static void main(String[] args) {
		Car car=new Car();
		InvocationHandler h=new TimeHandler(car);
		ClassLoader loader=car.getClass().getClassLoader();
		Class[] interfaces=car.getClass().getInterfaces();
		/*
		 * loader������������������
		 * interfaces��ʵ�ֵĽӿ�
		 * h��InvocationHandlerʵ��
		 */
		Moveable m=(Moveable) Proxy.newProxyInstance(loader, interfaces, h);
		m.move();
	}
}
