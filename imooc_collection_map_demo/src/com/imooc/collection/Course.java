package com.imooc.collection;
//�γ���
public class Course {
	public String id;
	public String name;
	public Course(String id,String name){
		this.id=id;
		this.name=name;
	}
	/**
	*����дequals����Ϊ�����ж����������Ƿ����
	*�Դ��жϴ�����������������������Ƿ���ͬ	 
	**/
	
	public boolean equals(Course other){
		if(this.id.equals(other.id) && this.name.equals(other.name)){
			return true;
		}
		return false;
	}
}
