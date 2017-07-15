package com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
//备选课程类
public class ListTest {
	public List courseToSelect;
	public ListTest(){
		this.courseToSelect=new ArrayList();
	}
	//用于添加课程
	public void testAdd(){
		Course cr1= new Course("1","数据结构");
		courseToSelect.add(cr1);
		Course temp=(Course) courseToSelect.get(0);
		System.out.println("添加课程:"+temp.id+temp.name);
		Course cr2=new Course("2","C语言");
		courseToSelect.add(0,cr2);
		Course temp2=(Course)courseToSelect.get(0);
		System.out.println("添加课程:"+temp2.id+temp2.name);
		Course[]course={new Course("3","离散数学"),new Course("4","汇编语言")};
		courseToSelect.addAll(Arrays.asList(course));
		Course temp3=(Course) courseToSelect.get(2);
		Course temp4=(Course)courseToSelect.get(3);
		System.out.println("添加两门课程:"+temp3.id+temp3.name+";"+temp4.id+temp4.name);
		}
	public void same(){
		Course cr1=new Course("1","书记");
		Course cr2=new Course("1","书记");
		Course cr3=new Course("1","书记");
		System.out.println(cr1.equals(cr3));
		System.out.println(cr2.equals(cr1));
		
		
	}
	//取List中元素
	public void getTest(){
		int size=courseToSelect.size();
		for(int i=0;i<size;i++){
			Course cr=(Course)courseToSelect.get(i);
			System.out.println("List中的课程有："+cr.id+cr.name);
		}
	}
	//迭代器遍历元素
	public void testIterator(){
		Iterator it=courseToSelect.iterator();
		while(it.hasNext()){
			Course cr=(Course)it.next();
			System.out.println("List中的课程有："+cr.id+cr.name);
		}
	}
	//foreach访问
	public void testForEach(){
		for(Object obj:courseToSelect){
			Course cr=(Course)obj;
			System.out.println("List中的课程有："+cr.id+cr.name);
		}
	}
	//修改元素
	public void testChange(){
		courseToSelect.set(0, new Course("5","毛概"));
		Course cr=(Course) courseToSelect.get(0);
		System.out.println("首门课程是:"+cr.name);
	}
	//删除课程
	public void testDelete(){
		courseToSelect.remove(0);
		
	}
	
	public static void main(String[] args) {
		ListTest lt=new ListTest();
//		lt.testAdd();
//		lt.getTest(); 
//		lt.testIterator();
//		lt.testForEach();
//		lt.testChange();
//		lt.testDelete();
//		lt.testForEach();
		lt.same();
	}
}
