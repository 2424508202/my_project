package com.imooc.collection;

public class Test {
	public String a="a";
	public final static String b ="b";
	{
		System.out.println("������ͨ���������ݣ�");
	}
	static{
		System.out.println("���Ǿ�̬���������ݣ�");
	}
	public  Test(){
		System.out.println("���ǹ������������ݣ�");
	}
	
	public static void main(String[] args)
	{
		Test t = new Test();
		System.out.println(t.a);
		System.out.println(t.b);
		
//		���Ǿ�̬���������ݣ�
//		������ͨ���������ݣ�
//		���ǹ������������ݣ�
//		a
//		b
//		 
		System.out.println(Test.b);
	}
}
 