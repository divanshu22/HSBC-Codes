package day9assignment.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import day9assignment.beans.Covid;
import day9assignment.factory.ObjectFactory;
import day9assignments.business.CovidService;

@WebServlet("/CovidFindAllServlet")
public class CovidFindAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CovidFindAllServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CovidService service = new ObjectFactory().getServiceInstance();
		List<Covid> detail = service.fetchdetail();
		PrintWriter pw = response.getWriter();
//		pw.print("<html><body>");
//		pw.print(employees);
//		pw.print("</body></html>");
		response.setContentType("application/json");
		Gson gson = new GsonBuilder().create();
		String employeesAllJSON = gson.toJson(detail).toString();
		pw.print(employeesAllJSON);
	}

}
