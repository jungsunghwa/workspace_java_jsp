package _20180518_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {
	static {
		try {
			String sql = null;
			PreparedStatement pstmt = null;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/database?useUnicode=true&characterEncoding=utf8", "root", "1234");

			if (con != null) {
				System.out.println("mysql ���Ӽ���");
				sql = "insert into member";
				sql = sql + " values(null, \"lim\", \"4321\", \"�Ӳ���\", \"�뱸 ��ǳ��\", \"a@naver.com\")";
				pstmt = con.prepareStatement(sql);
				int result = pstmt.executeUpdate();
				if (result == 1)
					System.out.println("�Է� ����");
				else
					System.out.println("�Է� ����");

			}

			sql = "select * from member";
			ResultSet rs = pstmt.executeQuery(sql);
			while (rs.next()) {
				System.out.print(rs.getString(1));
				System.out.print(rs.getString(2));
				System.out.print(rs.getString(3));
				System.out.print(rs.getString(4));
				System.out.print(rs.getString(5));
				System.out.println(rs.getString(6));
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new JDBCUtil();
	}
}
