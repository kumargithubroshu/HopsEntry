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

import org.bson.Document;



@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
private HospitalDAO customerDAO;
	
	public void init() {
		
		
		customerDAO=new HospitalDAO();
	}
       
    public Login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int emailid = Integer.parseInt(request.getParameter("emailid"));
		 boolean existingId=customerDAO.getDetails("emailid");
		 
		 if(existingId) {               
			 request.getRequestDispatcher("/welcome.jsp").forward(request, response);
         } else {
        	 request.setAttribute("error_message", "You need to register.");
        	 request.getRequestDispatcher("/registration.jsp").forward(request, response);
         }   
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String p1 = request.getParameter("emailid");
		String p2 = request.getParameter("password");
		String p3 = request.getParameter("captcha");
		String p4 = request.getParameter("captcha1");
		
		boolean a=customerDAO.getDetails(p1);
//		System.out.println(a);
		
//		request.setAttribute("emailid", p1);
//		request.setAttribute("password",p2);
		
		PrintWriter printWriter=response.getWriter();
		response.setContentType("text/html");
		
		
//		if(a==true)
//		{
//			
//		}
		
		
		
		
		
		if(p1.equals("roshan@gmail.com") && p2.equals("123"))
		
		
//		if(p1.equals("roshan@gmail.com") && p2.equals("123"))
		{
			if(p3.equals(p4))
			{
			
			printWriter.println("<h2>Welcome !!!!  ||   <a href=''></a></h2>");
//			RequestDispatcher dispatcher=request.getRequestDispatcher("cal.jsp");
			HttpSession session = request.getSession();
			session.setAttribute("username", p1);
			RequestDispatcher dispatcher=request.getRequestDispatcher("insert.jsp");
			dispatcher.include(request, response);
			
			}
			else
			{
				RequestDispatcher dispatcher=request.getRequestDispatcher("login.jsp");
				dispatcher.include(request, response);
			}
		}
		else
		{
			printWriter.println("<h2>You need to register !!!</h2> ");
			printWriter.println("<h4><a href=\"registration.jsp\">register here !!!!</a></h4>");
//			RequestDispatcher dispatcher=request.getRequestDispatcher("registration.jsp");
//			dispatcher.forward(request, response);
			
		}
	}
		
	
}
