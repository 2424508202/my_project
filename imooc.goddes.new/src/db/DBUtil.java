package db;
/*
 * jdbc连接mysql数据库
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {

	private static Connection conn=null;
	{
		try {
			//加载驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			//创建连接
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/imooc", "root", "123456");
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
//		return conn;连接异常
		return getConn();
	}
	
	public static Connection getConn()
	{
		try {
			//加载驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			//创建连接
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/imooc", "root", "123456");
			return conn;
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args) throws Exception {
			
	}
}