package com.imooc.collection;

import java.util.HashSet;
import java.util.Set;
//学生类
public class Student {
	//主键id
	public String id;
	//用户名
	public String name;
	public Set <Course>course;
	public Student(String id,String name){
		this.id=id;
		this.name=name;
		this.course=new HashSet<Course>();
	}
	
	
}
