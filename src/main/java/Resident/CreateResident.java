package Resident;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CreateResident
 */
public class CreateResident extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateResident() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		String rid = request.getParameter("residentid");
		String rusername = request.getParameter("rusername");
		String rpass = request.getParameter("rpassword");
		String rfname = request.getParameter("rfullname");
		String rpnumber = request.getParameter("rphonenum");
		String raddress = request.getParameter("raddress");
		String remail = request.getParameter("remail");
		
		out.println("<!DOCTYPE html><html><body>");
		out.println("Resident ID: " + rid + "<br> ");
		out.println("Username: " + rusername + "<br> ");
		out.println("Password: " + rpass + "<br> ");
		out.println("Full name: " + rfname + "<br> ");
		out.println("Phone number: " + rpnumber + "<br> ");
		out.println("Address: " + raddress + "<br> ");
		out.println("Email: " + remail + "<br> ");
		out.println("</html></body>");
	
	}

}
