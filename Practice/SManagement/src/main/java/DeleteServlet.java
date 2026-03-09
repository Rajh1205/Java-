
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		try
		{
			String id = req.getParameter("id");

			if(id != null)
			{
				int myid = Integer.parseInt(id);
				Dao.deletedata(myid);
			}

			resp.sendRedirect("ViewServlet");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}