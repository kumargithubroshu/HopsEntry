package start_First_Program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Add() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int a = Integer.parseInt(request.getParameter("num1"));
		int b= Integer.parseInt(request.getParameter("num2"));
		
		int c=a+b;
		
		HttpSession httpSession=request.getSession();
		httpSession.setAttribute("c", c); 
		
		response.sendRedirect("sub");
		
	}


}
