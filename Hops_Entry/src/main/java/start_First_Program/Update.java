package start_First_Program;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.Document;

@WebServlet("/update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
private CustomerDAO customerDAO;
	
	public void init() {
		
		
		customerDAO=new CustomerDAO();
	}
	
    public Update() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		Document getid = customerDAO.getid(id);
		request.setAttribute("customer", getid);
//		
		System.out.println("abc" +getid);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("update.jsp");
		dispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("fname");
		String email=request.getParameter("email");                     
		int age=Integer.parseInt(request.getParameter("age"));

		customerDAO.updateCustomer(id, name,email,age);
		
		response.sendRedirect("ViewDetails");
		
	}

}
