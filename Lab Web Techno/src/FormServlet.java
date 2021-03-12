

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Table
 */
@WebServlet({ "/FormServlet", "/Form_Servlet" })
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String birthday = request.getParameter("birthday");
		String gender = request.getParameter("gender");
		response.getOutputStream().println("  <table><tr>\r\n"
				+ "    <th>Firstname</th>\r\n"
				+ "    <th>Lastname</th>\r\n"
				+ "    <th>Birthday</th>\r\n"
				+ "    <th>Gender</th>\r\n"
				+ "  </tr>\r\n"
				+ "  <tr>"
				+ "    <th>"+fname+"</th>\r\n"
				+ "    <th>"+lname+"</th>\r\n"
				+ "    <th>"+birthday+"</th>\r\n"
				+ "    <th>"+gender+"</th>\r\n"
				+ "  </tr></table>\r\n");
		Cookie c = new Cookie("firstName",fname);
		c.setMaxAge(60*60*24);
		response.addCookie(c);
		Cookie co = new Cookie("LastName",lname);
		co.setMaxAge(60*60*24);
		response.addCookie(co);
		Cookie coo = new Cookie("birthDay",birthday);
		coo.setMaxAge(60*60*24);
		response.addCookie(coo);
		Cookie cook = new Cookie("Sex",gender);
		cook.setMaxAge(60*60*24);
		response.addCookie(cook);

	}

}
