package nsti;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class aditC extends HttpServlet {


	public void service(HttpServletRequest req, HttpServletResponse res) {
		String a = req.getParameter("name");
		String b = req.getParameter("age");
		String c = req.getParameter("mail");
		
		
		System.out.println(a + "  "+b+ " "+ c);
		
	}

}
