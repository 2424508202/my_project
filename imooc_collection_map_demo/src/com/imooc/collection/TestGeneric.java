package com.imooc.collection;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
	
	public  void testCo(){
		
	}
	
	
	//泛型
	public List<Course>course;
	public TestGeneric(){
		this.course=new ArrayList<Course>();
	}
	public void testAdd(){
		Course cr1=new Course("1","语文");
		
		
		course.add(cr1);
		//泛型集合中不能添加规定以外的类型
		Course cr2=new Course("2","java基础");
		course.add(cr2);
	}
	public void testForEach(){
		for(Course cr:course){
			System.out.println(cr.id+cr.name);
		}
			
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TestGeneric tg=new TestGeneric();
		tg.testAdd();
		tg.testForEach();
	}

}
