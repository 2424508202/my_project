package util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.dialect.function.StandardAnsiSqlAggregationFunctions;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

//�����࣬�����Ự��ȡ�͹ر�
public class HibernateUtil {
	private static SessionFactory sessionFactory;
	private static Session session;
	//��ʼ���Ự����
	static {
		// �������ö��󣬶�ȡHibernate.cfg.xml�ļ�
		Configuration config = new Configuration().configure();
		// �����������
		ServiceRegistry serviceRegistery = new ServiceRegistryBuilder().applySettings(config.getProperties())
				.buildServiceRegistry();
		// �����Ự����
		sessionFactory = config.buildSessionFactory(serviceRegistery);
	}
	//��ȡsessionFactory
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	} 
	//��ȡsession
	public static Session getSession(){
		session=sessionFactory.openSession();
		return session;
	}

	//�ر�session
	public static void closeSession(Session session){
		if(session!=null){
			session.close();
		}
	}
	
}
