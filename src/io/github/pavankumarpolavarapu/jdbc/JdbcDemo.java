package io.github.pavankumarpolavarapu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/jdbc-test";
		Connection conn = null;
		
		int rollno = 1;
		String name = "john";
		int age = 20;
		
		String sql = "insert into student(rollno, name, age) " + "values(" + rollno + ", '" + name + "', " + age + ")";
		System.out.println(sql);
		try {
			conn = DriverManager.getConnection(url, "postgres", "postgres");
			Statement st = conn.createStatement();
			int m = st.executeUpdate(sql);
			if ( m == 1) {
				System.out.println("inserted successfully" + sql);
			} else {
				System.out.println("insertion failed " + sql);
			}
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			conn.close();
		}

	}

}
