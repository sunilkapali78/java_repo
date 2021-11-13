package servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Customer;
import services.CustomerService;


@WebServlet(asyncSupported = true, urlPatterns = { "/HandleReq" })
public class HandleReq extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	CustomerService service=null; 
    public HandleReq() {
        super();
       this.service= new CustomerService();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  RequestDispatcher requestDispatcher = request.getRequestDispatcher("/list.jsp");
		  request.setAttribute("customers", service.GetCustomers());
          requestDispatcher.forward(request, response);


	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Customer c= new Customer();
		try {
			c.setName(request.getParameter("name"));
			c.setPassword(request.getParameter("password"));
		}
		catch (Exception e1) {
			response.getWriter().write(e1.getMessage());
			return;
		}
		
		
		try {
			if(service.AddCustomer(c))
			{
				response.getWriter().write("success");
				doGet(request, response);
			}
		} catch (SQLException e) {
			response.getWriter().write(e.getMessage());
			e.printStackTrace();
		};
	}

}
