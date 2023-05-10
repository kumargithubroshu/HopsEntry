package start_First_Program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.Document;


@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Registration() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String p1 = request.getParameter("firstname");
		String p2 = request.getParameter("middlename");
		String p3 = request.getParameter("lastname");
		String p4 = request.getParameter("user_course");
		int p5=Integer.parseInt(request.getParameter("password"));
		int p6=Integer.parseInt(request.getParameter("password1"));
		int p7=Integer.parseInt(request.getParameter("mobilenumber"));
		String p8 = request.getParameter("emailid");
		String p9 = request.getParameter("user_gender");
		
		String p10 = request.getParameter("captcha");
		String p11 = request.getParameter("captcha1");
		
		Document doc=new Document("firstname", p1).append("middlename",p2).append("lastname",p3).append("user_course",p4).append("password",p5).append("mobilenumber",p7).append("emailid",p8).append("user_gender",p9);
		HospitalDAO dao=new HospitalDAO();
		dao.insertDocument(doc);
		
		PrintWriter printWriter=response.getWriter();
		response.setContentType("text/html");
		
		if(p5 == p6)
		{
			if(p10.equals(p11))
			{
			
				printWriter.println("<h2>Registered Successfully !!!!</h2>");
				printWriter.println("<h4><a href=\"login.jsp\">login here !!!!</a></h4>");
				
//			printWriter.println(p1);
//			printWriter.println(p2);
//			printWriter.println(p3);
//			printWriter.println(p4);
//			printWriter.println(p5);
//			printWriter.println(p6);
//			printWriter.println(p7);
//			printWriter.println(p8);
//			printWriter.println(p9);
			}
			else
			{
				printWriter.println("<h2>Please enter Correct captcha ~~~~~</h2> ");
				printWriter.println("<h4><a href=\"registration.jsp\">register here !!!!</a></h4>");
			}
			
		}
		else
		{
			printWriter.println("<h2>Password Mismatched !!!</h2> ");
			printWriter.println("<h4><a href=\"registration.jsp\">register here !!!!</a></h4>");
		}
		
	}

}
