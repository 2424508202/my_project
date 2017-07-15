package com.imooc.collection;
/**
 * map���Գ���
 * @author yangzhiwei@qq.com
 * @date 2017-06-08
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	public Map<String,Student>students;
	public MapTest(){
		this.students=new HashMap<String,Student>();
	}
	/**
	 * ����id���ж�ѧ���Ƿ���ڣ����ڼ���ʾ��������������󱣴�
	 * @param args
	 */
	public void testPut(){
		Scanner input=new Scanner(System.in);
		int i=0;
		while(i<3){
			System.out.println("������ѧ��id");
			String id=input.next();
			Student st=students.get(id);
			if(st==null){
				System.out.println("������ѧ������");
				String name=input.next();
				Student newstudent=new Student(id,name);
				students.put(id, newstudent);
				i++;
			}
			else{
				System.out.println("��ѧ���Ѵ��ڣ�");
			}
		}
	}
	
	//����MapԪ��
	public void testKeySet(){
		Set<String>keySet=students.keySet();
		for (String stuId : keySet) {
			Student st=students.get(stuId);
			if(st!=null)
				System.out.println("ѧ����"+st.name);
		}
	}
	//ɾ��Ԫ��
	public void testDelete(){
		System.out.println("������Ҫɾ��ѧ��id");
		Scanner input=new Scanner(System.in);
		String id=input.next();
		Student st=students.get(id);
		if(st!=null){
			students.remove(id);
		}else{
			System.out.println("��ѧ�������ڣ�1");
		}
	}
	public void testEntrySet(){
		Set<Entry<String,Student>>entrySet=students.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			System.out.println("ȡ�ý���"+entry.getKey());
			System.out.println("��ӦֵΪ��"+entry.getValue().name);
		}
	}
	
	//�޸���Ϣ
	public void testChange(){
		System.out.println("������Ҫ�޸�ѧ��id");
		Scanner input=new Scanner(System.in);
		
		String id=input.next();
		Student st=students.get(id);
		if(st==null){
			System.out.println("��ѧ�������ڣ�");
		}else{
			System.out.println("�������޸ĺ�����֣�");
			String name=input.next();
			Student newStu=new Student(id,name);
			students.put(id, newStu);
		
		}
	}
	
	public static void main(String[] args) {
		MapTest mp=new MapTest();
		mp.testPut();
		mp.testKeySet();
		mp.testDelete();
		mp.testEntrySet();
		mp.testChange();
		mp.testKeySet();
	}

}
