package goddessDate;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import db.DBUtil;
import model.Goddess;

import java.util.ArrayList;
import java.util.List;

/*
	 * 模型层完成对数据库中数据的操作
	 */
	public class GoddessDate {
		//增加女神
		public void addGoddess(Goddess g) throws Exception{
			Connection conn=DBUtil.getConnection();
			PreparedStatement ptmt=conn.prepareStatement("insert into goddess(name,age,sex)"+"values (" + "?,?,?,creat_date,creat_date)");
			ptmt.setString(1, g.getName());
			ptmt.setInt(2,g.getAge());
			ptmt.setString(3, g.getSex());
			ptmt.execute();
			
			
		}
		//更新女神信息
		public void updateGoddess(Goddess g) throws Exception{
			Connection conn=DBUtil.getConnection();
			PreparedStatement ptmt=conn.prepareStatement(" update gooddess set name = ? , sex = ? " + " where id = " + " ? ");
			ptmt.setString(1, g.getName());
			ptmt.setInt(2,g.getAge());
			ptmt.execute();
		}
		//删除女神
		public void deleteGoddess(Integer id) throws SQLException{
			Connection conn=DBUtil.getConnection();
			PreparedStatement ptmt=conn.prepareStatement("delete from goddess where id=?");
			ptmt.setInt(1, id);
			ptmt.execute();
			
		} 
		//查找单个女神
		public Goddess getGoddess(Integer id) throws Exception{
			Goddess g = null;
			Connection conn=DBUtil.getConnection();
			PreparedStatement ptmt=conn.prepareStatement("select * from goddess where id=?");
			ptmt.setInt(1,id);
			ResultSet rs=ptmt.executeQuery();
			while(rs.next()){
				g=new Goddess();
				g.setId(rs.getInt("id"));
				g.setSex(rs.getString("sex"));
				g.setName(rs.getString("user_name"));
			}
			return g;
		}
		
		
		
		//同时查找多个女神
		public List<Goddess> getMoreGoddess() throws Exception{
//			DBUtil util = new DBUtil();
//			Connection conn=util.getConn();
//			Statement stmt = null;
//			ResultSet rs = null;
//			try {
//				stmt = (Statement)conn.createStatement();
//			} catch (SQLException e) {
//				// TODO 自动生成的 catch 块
//				e.printStackTrace();
//			}
//		    try {
//				 rs=stmt.executeQuery("select name from goddess ");
//			} catch (SQLException e) {
//				// TODO 自动生成的 catch 块
//				e.printStackTrace();
//			}
			Connection conn = DBUtil.getConnection();
			Statement stmt=(Statement)conn.createStatement();
			ResultSet rs=stmt.executeQuery("select name,age from goddess");
			List<Goddess>gs=new ArrayList<Goddess>();
			Goddess g=null;
				while(rs.next()){
					g=new Goddess();
					g.setName(rs.getString("name"));
					g.setAge(rs.getInt("age"));
					gs.add(g);		
				}
					return gs;
				}
				
	}