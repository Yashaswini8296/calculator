package calculator;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/mul")
public class Multiplication implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num1= Integer.parseInt(req.getParameter("num1"));
		int num2= Integer.parseInt (req.getParameter("num2"));
		//int number1=Integer.parseInt(num1);
		//int number2=Integer.parseInt(num2);
		resp.getWriter().print("<h1 style=\"color:red\">The Product of "+num1+" and "+num2+" is "+(num1*num2)+"</h1>");
	}
	
}
