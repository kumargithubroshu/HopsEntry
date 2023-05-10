package start_First_Program;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.Document;



@WebServlet("/ViewDetails")
public class ViewDetails extends HttpServlet {
	
	
	private CustomerDAO customerDAO;
	
	public void init() {
		
		
		customerDAO=new CustomerDAO();
	}
	
	
	
	
	
	private static final long serialVersionUID = 1L;
       
    public ViewDetails() {
        super();
    }

  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
//		CustomerDAO customerDAO=new CustomerDAO();
		List<Document> documents=customerDAO.getAllDocuments();
		
//		System.out.println("gjsjqgsgqsuiq"+documents);
		
		request.setAttribute("documents", documents);
		RequestDispatcher dispatcher = request.getRequestDispatcher("view.jsp");
		
		dispatcher.forward(request, response);
	
	}

}
