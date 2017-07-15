package com.imooc.collection;

public class Test {
	public String a="a";
	public final static String b ="b";
	{
		System.out.println("我是普通方法块内容！");
	}
	static{
		System.out.println("我是静态方法块内容！");
	}
	public  Test(){
		System.out.println("我是构造器方法内容！");
	}
	
	public static void main(String[] args)
	{
		Test t = new Test();
		System.out.println(t.a);
		System.out.println(t.b);
		
//		我是静态方法块内容！
//		我是普通方法块内容！
//		我是构造器方法内容！
//		a
//		b
//		 
		System.out.println(Test.b);
	}
}
 