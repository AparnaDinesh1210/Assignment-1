

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculation
 */
@WebServlet("/Calculate")
public class Calculate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int number1 = Integer.parseInt(request.getParameter("num1"));
		int number2 = Integer.parseInt(request.getParameter("num2"));
		
		String calculation  = request.getParameter("calc");
		System.out.println("You have clicked "+calculation +"button");
		
		int result=0;
		if(calculation.equalsIgnoreCase("add"))
		{
			result = number1 + number2;
			out.print("Result of add = "+result);
		}
		
		else if(calculation.equalsIgnoreCase("sub"))
		{
			result = number1 - number2;
			out.print("Result of sub = "+result);
		}

// int num = Integer.parseInt(request.getParameter("num1"));
}

}
