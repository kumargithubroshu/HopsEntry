package start_First_Program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/Registration")
public class MobileNumberFilter extends HttpFilter implements Filter {
       
   
    public MobileNumberFilter() {
        super();
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpServletRequest=(HttpServletRequest)request;
		
		int p7=Integer.parseInt(request.getParameter("mobilenumber"));
		PrintWriter printWriter=response.getWriter();
		
		if(p7>1)
		
		chain.doFilter(request, response);
		
		else
		
			printWriter.println("Invalid mobile number");
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
