package com.imooc.collection;

import java.util.HashSet;
import java.util.Set;
//ѧ����
public class Student {
	//����id
	public String id;
	//�û���
	public String name;
	public Set <Course>course;
	public Student(String id,String name){
		this.id=id;
		this.name=name;
		this.course=new HashSet<Course>();
	}
	
	
}
