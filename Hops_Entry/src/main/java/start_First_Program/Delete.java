package start_First_Program;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Delete() {
        super();
    }
private CustomerDAO customerDAO;
	
	public void init() {
		
		
		customerDAO=new CustomerDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int a=Integer.parseInt(request.getParameter("id"));
		
		customerDAO.deleteCustome(a);
		
		response.sendRedirect("ViewDetails");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		
	    
	}

}
