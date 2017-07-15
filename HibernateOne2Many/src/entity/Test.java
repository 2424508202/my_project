package entity;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;


/*
 * ����һ�Զ�
 */
public class Test {
	public static void main(String[] args) {
		add(); 
		
	}
	public static void add(){
		Grade g=new Grade("һ��", "java����");
		Student s1=new Student("����","��");
		Student s2=new Student("����","��");
		//���ϣ����ѧ��������Ӱ༶��ţ���Ҫ�ڰ༶�����ѧ������������
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
	//��ѯ�༶���ѧ��
	public static void findStudentsByGrade(){
		Session session=HibernateUtil.getSession();
		Grade grade=(Grade) session.get(Grade.class, 1);
		System.out.println(grade.getGname()+","+grade.getGdesc());
	}
	//�޸�ѧ����Ϣ
	public static void update(){
		Grade g=new Grade("����", "Java������");
		
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		Student s=(Student) session.get(Student.class, 1);
		//g.getStudents().add(s);
		session.save(g);
		tx.commit();
		HibernateUtil.closeSession(session);
	}

	//ɾ��ѧ��
	public static void delete(){
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		Student s=(Student) session.get(Student.class, 2);
		session.delete(s);
		tx.commit();
		HibernateUtil.closeSession(session);
	}
	
}
