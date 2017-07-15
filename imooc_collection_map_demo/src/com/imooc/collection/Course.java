package com.imooc.collection;
//课程类
public class Course {
	public String id;
	public String name;
	public Course(String id,String name){
		this.id=id;
		this.name=name;
	}
	/**
	*以重写equals方法为例，判断两个对象是否相等
	*以此判断传入对象的属性与自身的属性是否相同	 
	**/
	
	public boolean equals(Course other){
		if(this.id.equals(other.id) && this.name.equals(other.name)){
			return true;
		}
		return false;
	}
}
