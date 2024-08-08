import java.io.IOException;


import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@webServlet("/login")
public class allC extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String name = req.getParameter("name");
		
	
		PrintWriter pw = res.getWriter();
		pw.print("Form accepted" + " "+name);
	
	}	

}
