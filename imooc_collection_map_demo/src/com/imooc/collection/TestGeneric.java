package com.imooc.collection;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
	
	public  void testCo(){
		
	}
	
	
	//����
	public List<Course>course;
	public TestGeneric(){
		this.course=new ArrayList<Course>();
	}
	public void testAdd(){
		Course cr1=new Course("1","����");
		
		
		course.add(cr1);
		//���ͼ����в�����ӹ涨���������
		Course cr2=new Course("2","java����");
		course.add(cr2);
	}
	public void testForEach(){
		for(Course cr:course){
			System.out.println(cr.id+cr.name);
		}
			
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TestGeneric tg=new TestGeneric();
		tg.testAdd();
		tg.testForEach();
	}

}
