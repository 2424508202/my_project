package com.imooc.cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {
	//��������������
	private Enhancer enhance=new Enhancer();
	//������Ҫ�������
	public Object getProxy(Class clazz){
		//���ô����������
		enhance.setSuperclass(clazz);
		enhance.setCallback(this);
		
		return enhance.create();
	}

	/*
	 * ��������Ŀ���෽���ĵ���
	 * obj��Ŀ�����ʵ��
	 * m:Ŀ�귽���ķ��ض���
	 * args�������Ĳ���
	 * proxy��������ʵ��
	 */
	@Override
	public Object intercept(Object obj, Method m, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("��־��ʼ������");
		//��������ø��෽��
		proxy.invokeSuper(obj, args);
		System.out.println("��ֱ����������");
		return null;
	}

}
