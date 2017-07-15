package util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.dialect.function.StandardAnsiSqlAggregationFunctions;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

//工具类，用来会话获取和关闭
public class HibernateUtil {
	private static SessionFactory sessionFactory;
	private static Session session;
	//初始化会话工厂
	static {
		// 创建配置对象，读取Hibernate.cfg.xml文件
		Configuration config = new Configuration().configure();
		// 创建服务对象
		ServiceRegistry serviceRegistery = new ServiceRegistryBuilder().applySettings(config.getProperties())
				.buildServiceRegistry();
		// 创建会话工厂
		sessionFactory = config.buildSessionFactory(serviceRegistery);
	}
	//获取sessionFactory
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	} 
	//获取session
	public static Session getSession(){
		session=sessionFactory.openSession();
		return session;
	}

	//关闭session
	public static void closeSession(Session session){
		if(session!=null){
			session.close();
		}
	}
	
}
