package alldP;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class alldC extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) {
		String a = req.getParameter("name");
		System.out.println(a);

}
}
