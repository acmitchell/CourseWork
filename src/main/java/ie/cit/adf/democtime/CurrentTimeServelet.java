package ie.cit.adf.democtime;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CurrentTimeServelet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
		
		PrintWriter mywriter = resp.getWriter();
		mywriter.println("<html>");
		mywriter.println("<body>");
		mywriter.println("Current time"+new Date());
		mywriter.println("</body>");
		mywriter.println("/<html>");
		mywriter.close();
	}

}
