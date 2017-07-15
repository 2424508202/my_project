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
	//������ӿγ�
	public void testAdd(){
		Course cr1=new Course("1","���ݽṹ");
		courseToSelect.add(cr1);
		Course temp=(Course) courseToSelect.get(0);
		//System.out.println("��ӿγ�:"+temp.id+temp.name);
		Course cr2=new Course("2","C����");
		courseToSelect.add(0,cr2);
		Course temp2=(Course)courseToSelect.get(0);
		//System.out.println("��ӿγ�:"+temp2.id+temp2.name);
		Course[]course={new Course("3","��ɢ��ѧ"),new Course("4","�������")};
		courseToSelect.addAll(Arrays.asList(course));
		Course temp3=(Course) courseToSelect.get(2);
		Course temp4=(Course)courseToSelect.get(3);
		//System.out.println("������ſγ�:"+temp3.id+temp3.name+";"+temp4.id+temp4.name);
		}
	//foreach����
	public void testForEach(){
		for(Object obj:courseToSelect){
			Course cr=(Course)obj;
			System.out.println("List�еĿγ��У�"+cr.id+cr.name);
		}
	}
	//contains�������������Ƿ����ĳ������
	public void testContains(){
		Course course=courseToSelect.get(0);
		System.out.println("ȡ�ÿγ̣�"+course.name);
		System.out.println("��ѡ�γ����Ƿ����"+course.name+
				courseToSelect.contains(course));
		
	}
	
	
	public static void main(String[] args) {
		SetTest st=new SetTest();
		st.testAdd();
		st.testForEach();
		st.testContains();
		
		Student student=new Student("1","С��");
		System.out.println("��ӭѧ����"+student.name+"ѡ�Σ���");
		Scanner input=new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.println("������γ����");
			String ID=input.next();
			for (Course cr : st.courseToSelect) {
				if(ID.equals(cr.id)){
					student.course.add(cr);
				}
			}
		}
		for (Course cr : student.course) {
			System.out.println("��ѡ���ˣ�"+cr.id+cr.name);
		}
				
	}

}
