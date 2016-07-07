package registerServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.*;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		doGet(request, response);
		
		//declaram 
		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		String email = request.getParameter("email");
        String password = request.getParameter("password");
        String admin_rights = request.getParameter("admin-rights");
        //verificam sa nu fie campuri goale
        if(!name.isEmpty() && !surname.isEmpty() && !email.isEmpty() && !password.isEmpty())
        {
        	//setam email si trimitem la index
        	request.setAttribute("email", email);
        	//redirectioneaza dupa login la lista cu proiecte
        	request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        
        if(!admin_rights.isEmpty()){
        	
        	
        }
	}

}
