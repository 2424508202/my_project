package com.imooc.collection;
/**
 * map测试程序
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
	 * 输入id，判断学生是否存在，存在即提示，否则添加姓名后保存
	 * @param args
	 */
	public void testPut(){
		Scanner input=new Scanner(System.in);
		int i=0;
		while(i<3){
			System.out.println("请输入学生id");
			String id=input.next();
			Student st=students.get(id);
			if(st==null){
				System.out.println("请输入学生姓名");
				String name=input.next();
				Student newstudent=new Student(id,name);
				students.put(id, newstudent);
				i++;
			}
			else{
				System.out.println("该学生已存在！");
			}
		}
	}
	
	//遍历Map元素
	public void testKeySet(){
		Set<String>keySet=students.keySet();
		for (String stuId : keySet) {
			Student st=students.get(stuId);
			if(st!=null)
				System.out.println("学生："+st.name);
		}
	}
	//删除元素
	public void testDelete(){
		System.out.println("请输入要删除学生id");
		Scanner input=new Scanner(System.in);
		String id=input.next();
		Student st=students.get(id);
		if(st!=null){
			students.remove(id);
		}else{
			System.out.println("该学生不存在！1");
		}
	}
	public void testEntrySet(){
		Set<Entry<String,Student>>entrySet=students.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			System.out.println("取得建："+entry.getKey());
			System.out.println("对应值为："+entry.getValue().name);
		}
	}
	
	//修改信息
	public void testChange(){
		System.out.println("请输入要修改学生id");
		Scanner input=new Scanner(System.in);
		
		String id=input.next();
		Student st=students.get(id);
		if(st==null){
			System.out.println("该学生不存在！");
		}else{
			System.out.println("请输入修改后的名字！");
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
