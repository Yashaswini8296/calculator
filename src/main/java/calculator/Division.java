package calculator;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/div")
public class Division extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		double num1= Double.parseDouble(req.getParameter("num1"));
		double num2= Double.parseDouble (req.getParameter("num2"));
		//int number1=Integer.parseInt(num1);
		//int number2=Integer.parseInt(num2);
		resp.getWriter().print("<h1 style=\"color:red\">The Product of "+num1+" and "+num2+" is "+(num1/num2)+"</h1>");
		
		
		
	}

}
