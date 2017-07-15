package com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest{
	public List<Course>courseToSelect;
	public SetTest(){
		courseToSelect=new ArrayList<Course>();
	}
	//用于添加课程
	public void testAdd(){
		Course cr1=new Course("1","数据结构");
		courseToSelect.add(cr1);
		Course temp=(Course) courseToSelect.get(0);
		//System.out.println("添加课程:"+temp.id+temp.name);
		Course cr2=new Course("2","C语言");
		courseToSelect.add(0,cr2);
		Course temp2=(Course)courseToSelect.get(0);
		//System.out.println("添加课程:"+temp2.id+temp2.name);
		Course[]course={new Course("3","离散数学"),new Course("4","汇编语言")};
		courseToSelect.addAll(Arrays.asList(course));
		Course temp3=(Course) courseToSelect.get(2);
		Course temp4=(Course)courseToSelect.get(3);
		//System.out.println("添加两门课程:"+temp3.id+temp3.name+";"+temp4.id+temp4.name);
		}
	//foreach访问
	public void testForEach(){
		for(Object obj:courseToSelect){
			Course cr=(Course)obj;
			System.out.println("List中的课程有："+cr.id+cr.name);
		}
	}
	//contains方法，序列中是否包含某个对象
	public void testContains(){
		Course course=courseToSelect.get(0);
		System.out.println("取得课程："+course.name);
		System.out.println("备选课程中是否包含"+course.name+
				courseToSelect.contains(course));
		
	}
	
	
	public static void main(String[] args) {
		SetTest st=new SetTest();
		st.testAdd();
		st.testForEach();
		st.testContains();
		
		Student student=new Student("1","小明");
		System.out.println("欢迎学生："+student.name+"选课！！");
		Scanner input=new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.println("请输入课程序号");
			String ID=input.next();
			for (Course cr : st.courseToSelect) {
				if(ID.equals(cr.id)){
					student.course.add(cr);
				}
			}
		}
		for (Course cr : student.course) {
			System.out.println("您选择了："+cr.id+cr.name);
		}
				
	}

}
