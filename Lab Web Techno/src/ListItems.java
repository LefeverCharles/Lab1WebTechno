

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ListItems
 */
@WebServlet("/ListItems")
public class ListItems extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListItems() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession s = request.getSession(true);
		PrintWriter out = response.getWriter();
        if (s.getAttribute("itemsList") == null) {
        	String newItem = request.getParameter("newItem");
        	ArrayList<String> attribute = new ArrayList<>();
        	attribute.add(newItem);
        	s.setAttribute("itemsList", attribute);
            out.println("<p>" + newItem + "</p>");
            out.println("</body>");
        }
        else {
        	String newItem = request.getParameter("newItem");
			ArrayList<String> attribute = (ArrayList<String>) s.getAttribute("itemsList");
            attribute.add(newItem);
            s.setAttribute("itemsList", attribute);
            attribute.forEach(element -> out.println("<p>" + element + "</p>"));
            out.println("</body>");}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
