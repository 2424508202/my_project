package com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
//��ѡ�γ���
public class ListTest {
	public List courseToSelect;
	public ListTest(){
		this.courseToSelect=new ArrayList();
	}
	//������ӿγ�
	public void testAdd(){
		Course cr1= new Course("1","���ݽṹ");
		courseToSelect.add(cr1);
		Course temp=(Course) courseToSelect.get(0);
		System.out.println("��ӿγ�:"+temp.id+temp.name);
		Course cr2=new Course("2","C����");
		courseToSelect.add(0,cr2);
		Course temp2=(Course)courseToSelect.get(0);
		System.out.println("��ӿγ�:"+temp2.id+temp2.name);
		Course[]course={new Course("3","��ɢ��ѧ"),new Course("4","�������")};
		courseToSelect.addAll(Arrays.asList(course));
		Course temp3=(Course) courseToSelect.get(2);
		Course temp4=(Course)courseToSelect.get(3);
		System.out.println("������ſγ�:"+temp3.id+temp3.name+";"+temp4.id+temp4.name);
		}
	public void same(){
		Course cr1=new Course("1","���");
		Course cr2=new Course("1","���");
		Course cr3=new Course("1","���");
		System.out.println(cr1.equals(cr3));
		System.out.println(cr2.equals(cr1));
		
		
	}
	//ȡList��Ԫ��
	public void getTest(){
		int size=courseToSelect.size();
		for(int i=0;i<size;i++){
			Course cr=(Course)courseToSelect.get(i);
			System.out.println("List�еĿγ��У�"+cr.id+cr.name);
		}
	}
	//����������Ԫ��
	public void testIterator(){
		Iterator it=courseToSelect.iterator();
		while(it.hasNext()){
			Course cr=(Course)it.next();
			System.out.println("List�еĿγ��У�"+cr.id+cr.name);
		}
	}
	//foreach����
	public void testForEach(){
		for(Object obj:courseToSelect){
			Course cr=(Course)obj;
			System.out.println("List�еĿγ��У�"+cr.id+cr.name);
		}
	}
	//�޸�Ԫ��
	public void testChange(){
		courseToSelect.set(0, new Course("5","ë��"));
		Course cr=(Course) courseToSelect.get(0);
		System.out.println("���ſγ���:"+cr.name);
	}
	//ɾ���γ�
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
