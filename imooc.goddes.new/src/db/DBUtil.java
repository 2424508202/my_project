package db;
/*
 * jdbc����mysql���ݿ�
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {

	private static Connection conn=null;
	{
		try {
			//������������
			Class.forName("com.mysql.jdbc.Driver");
			//��������
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/imooc", "root", "123456");
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
//		return conn;�����쳣
		return getConn();
	}
	
	public static Connection getConn()
	{
		try {
			//������������
			Class.forName("com.mysql.jdbc.Driver");
			//��������
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/imooc", "root", "123456");
			return conn;
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args) throws Exception {
			
	}
}