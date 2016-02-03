package sample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void init() throws ServletException {
		// Servlet initialization code here
		super.init();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// Set response content type
		response.setContentType("text/html");

		// Actual logic goes here.
		String str1 = request.getParameter("string1");
		String str2 = request.getParameter("string2");
		String newstr = MyConcatenator.concatenate(str1, str2);
		PrintWriter out = response.getWriter();
		out.println("<h1>Hurray !!\n This Servlet is built using Maven!! "
				+ newstr + "</h1>");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	public void destroy() {
		// resource release
		super.destroy();
	}
}