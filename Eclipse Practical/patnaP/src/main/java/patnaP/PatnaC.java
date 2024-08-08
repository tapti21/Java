package patnaP;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class PatnaC extends HttpServlet{
	
		public void service(HttpServletRequest req, HttpServletResponse res) {
			String name = req.getParameter("name");
			double eng = Integer.parseInt(req.getParameter("eng"));
			double maths = Integer.parseInt(req.getParameter("maths"));
			System.out.println(name);

	}

}

