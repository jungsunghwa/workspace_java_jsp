package _20180518_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {
	public static void main(String[] args) {
		try {
	         Class.forName("com.mysql.jdbc.Driver");
	         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database?useUnicode=true&characterEncoding=utf8" , "root", "1234");
	         
	         if(con != null) {
	        	 System.out.println("mysql ���Ӽ���");
	        	 String sql = "insert into member";
	        	 sql = sql + " values(null, \"lim\", \"4321\", \"�Ӳ���\", \"�뱸 ��ǳ��\", \"a@naver.com\")";
	        	 PreparedStatement pstmt = con.prepareStatement(sql);
	        	 int result = pstmt.executeUpdate();
	        	 if(result == 1)
	        		 System.out.println("�Է� ����");
	        	 else
	        		 System.out.println("�Է� ����");
	         }
	     } catch(ClassNotFoundException e) {
	    	 e.printStackTrace();
	     } catch(SQLException e) {
	    	 e.printStackTrace();
	     }
	}
	static{
	     
     }

     
}
