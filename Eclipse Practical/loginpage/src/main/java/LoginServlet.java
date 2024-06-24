

import java.io.IOException;


import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		response.setContentType("text/jsp");
		PrintWriter out = response.getWriter();
		
		
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginpage", "root", "");
			
			PreparedStatement ps = con.prepareStatement("insert into login values (?,?)");
			
			ps.setString(1,  email);
			ps.setString(2,  pwd);
			ps.executeUpdate();
			
			
				out.print("Login Successfully");
			
			
		}catch(Exception e) {
			System.out.println("something error");
		}
		
		
	}

}
