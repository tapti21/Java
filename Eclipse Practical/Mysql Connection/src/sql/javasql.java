
package sql;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.*;


public class javasql {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
						//......... Connection establish.............//
//		 Connection conn =DriverManager.getConnection("jdbc:mysql://localhost","root","");
//		System.out.print("connected");
		
						//.......... show databases..............//
//		 Connection conn =DriverManager.getConnection("jdbc:mysql://localhost","root","");
//			System.out.print("connected");
//		Statement st = conn.createStatement();
//		ResultSet rs = st.executeQuery("show databases");
//		System.out.print("Database are: "+ rs);
//		
//		while(rs.next()) {
//			System.out.print(rs.getString(1));
//		}
		
		
							//.........  Database Created ..........//
//		 Connection conn =DriverManager.getConnection("jdbc:mysql://localhost","root","");
//			System.out.print("connected");
//		Statement st = conn.createStatement();
//		st.executeUpdate("Create database adit");
//		System.out.print("Database created: ");
//		

		
							//........... Created Table ............//
//		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/adit","root","");
//		String sql = "create table adit(id int, name varchar(30), address varchar(50), mail varchar(45)primary key)";
//		Statement st = conn.createStatement();
//		st.executeUpdate(sql);
//		System.out.print("Table created");
		
							//.......... Insert Data.............//
//		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/adit","root","");
//		String sql = "insert into nsti values(01,'Trapti','Etawah','t@gmail.com')";
//		Statement st = conn.createStatement();
//		st.executeUpdate(sql);
//		System.out.print("Insert data");
		
		
		
									//......... Multi Inserted Data ...........//
//		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/adit","root","");
//		String sql = "insert into nsti values(03,'Pratibha','Jushi','Pra@gmail.com'),(04,'Annu','Allahabad','A@gmail.com')";
//		Statement st = conn.createStatement();
//		st.executeUpdate(sql);
//		System.out.print("Multi Insert data");
		
		
							//.......... Show Details ..........//
//		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/adit","root","");
//		String sql = "select * from nsti";
//		Statement st = conn.createStatement();
//		ResultSet res = st.executeQuery(sql);
//		while(res.next()) {
//		System.out.println(res.getString("id")+ "-" + res.getString("name") + "-" + res.getString("address") + "-" + res.getString("mail"));
//		}
		
		
		
								//......... Update data ...........//
//		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/adit","root","");
//		String sql = "update nsti set name = 'arya' where name = 'Annu'";
//		Statement st = conn.createStatement();
//		st.executeUpdate(sql);
//		System.out.print("Data Update");
	
		
		
		
						//......... Data deleted throw ID .............//
//		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/adit","root","");
//		String sql = "Delete from nsti where id = '2'";
//		Statement st = conn.createStatement();
//		st.executeUpdate(sql);
//		System.out.print("Data deleted");
		
		
//						//......... Delete Table .........//
//		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/adit","root","");
//		String sql = "Drop Table adit";
//		Statement st = conn.createStatement();
//		st.executeUpdate(sql);
//		System.out.print("Table deleted");
//		
		
		
					//........... Add new column ...........//
//		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/adit","root","");
//		String sql = "Alter table nsti add column age int";
//		Statement st = conn.createStatement();
//		st.executeUpdate(sql);
//		System.out.print("New column add");
		
	
		
		
						//.......Single data show ...........//
//		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/adit","root","");
//		String sql = "select * from nsti where id = '3'";
//		Statement st = conn.createStatement();
//		ResultSet res = st.executeQuery(sql);
//		while(res.next()) {
//		System.out.println(res.getString("id")+ "-" + res.getString("name") + "-" + res.getString("address") + "-" + res.getString("mail"));
//		}
		
		
//		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/adit","root","");
//		String sql = "Alter table nsti drop age";
//		Statement st = conn.createStatement();
//		st.executeUpdate(sql);
//		System.out.print("Drop column");
		
		
		
		
		
		
		// TODO Auto-generated method stub
		
		

	}

}
