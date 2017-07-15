package com.imooc.cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {
	//创建代理类属性
	private Enhancer enhance=new Enhancer();
	//传递需要代理的类
	public Object getProxy(Class clazz){
		//设置创建子类的类
		enhance.setSuperclass(clazz);
		enhance.setCallback(this);
		
		return enhance.create();
	}

	/*
	 * 拦截所有目标类方法的调用
	 * obj：目标类的实例
	 * m:目标方法的返回对象
	 * args：方法的参数
	 * proxy：代理类实例
	 */
	@Override
	public Object intercept(Object obj, Method m, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("日志开始。。。");
		//代理类调用父类方法
		proxy.invokeSuper(obj, args);
		System.out.println("日直结束。。。");
		return null;
	}

}
