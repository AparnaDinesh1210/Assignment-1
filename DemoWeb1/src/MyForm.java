

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyForm
 */
@WebServlet("/MyForm")
public class MyForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("Hello you have called the server from the client..." +"<br>");
		
		String firstName=request.getParameter("fname");
		String lastName=request.getParameter("lname");
		
		out.print("Your first name is "+firstName + "<br>");
		out.print("Your last name is "+lastName);
		
		System.out.println("Service is called ");
		
	}
	
	MyForm()
	{
		System.out.println("Constructor is called");
	}
	
	public void init()
	{
		System.out.println("Init is called");
	}
	
	public void destroy()
	{
		System.out.println("Destroy is called");
	}

}
