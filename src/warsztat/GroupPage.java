package warsztat;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GroupPage
 */
@WebServlet("/groupPage")
public class GroupPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try(Connection conn = DbUtil.getConnection()){
			ArrayList<Group> groupList = new ArrayList<>(Arrays.asList(Group.loadAll(conn)));
			request.setAttribute("list", groupList);			
			
		}catch (SQLException e) {
			e.getMessage();
		}
		
		getServletContext().getRequestDispatcher("/group.jsp").forward(request, response);		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
		
	}

}
