package entity;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;


/*
 * 单向一对多
 */
public class Test {
	public static void main(String[] args) {
		add(); 
		
	}
	public static void add(){
		Grade g=new Grade("一班", "java开发");
		Student s1=new Student("张三","男");
		Student s2=new Student("李四","男");
		//如果希望在学生表中添加班级编号，需要在班级中添加学生，建立关联
		g.getStudents().add(s1);
		g.getStudents().add(s2);
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		session.save(g);
		session.save(s1);
		session.save(s2);
		tx.commit();
		HibernateUtil.closeSession(session);
	}
	//查询班级里的学生
	public static void findStudentsByGrade(){
		Session session=HibernateUtil.getSession();
		Grade grade=(Grade) session.get(Grade.class, 1);
		System.out.println(grade.getGname()+","+grade.getGdesc());
	}
	//修改学生信息
	public static void update(){
		Grade g=new Grade("二班", "Java二班编程");
		
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		Student s=(Student) session.get(Student.class, 1);
		//g.getStudents().add(s);
		session.save(g);
		tx.commit();
		HibernateUtil.closeSession(session);
	}

	//删除学生
	public static void delete(){
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		Student s=(Student) session.get(Student.class, 2);
		session.delete(s);
		tx.commit();
		HibernateUtil.closeSession(session);
	}
	
}
