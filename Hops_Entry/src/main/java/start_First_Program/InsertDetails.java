package start_First_Program;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.Document;

@WebServlet("/InsertDetails")
public class InsertDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public InsertDetails() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            
		String name = request.getParameter("fname");
		int id=Integer.parseInt(request.getParameter("id"));
		int age=Integer.parseInt(request.getParameter("age"));
		String email=request.getParameter("email");
		
		Document doc=new Document("fname", name).append("id",id).append("age", age).append("email", email);
		CustomerDAO customerDAO=new CustomerDAO();
		customerDAO.insertDocument(doc);
		
		response.sendRedirect("ViewDetails");
	
	}

}
