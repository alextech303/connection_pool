package ex.connectionPool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class DBResourceManager {
	
//	private final static DBResourceManager instance = new DBResourceManager();
//	private ResourceBundle bundle = ResourceBundle.getBundle("connection_pool"); 
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
//		
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/connection_pool?useSSL=false","root", "g145101988Q");

//		String sql = "INSERT INTO table1(row1) VALUES(?)";
//		PreparedStatement ps = con.prepareStatement(sql);
//
//		ps.setString(1, "jjj");
//	   
//
//		ps.executeUpdate();

System.out.println("!!!");
}
	}

