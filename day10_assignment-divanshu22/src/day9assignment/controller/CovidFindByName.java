package day9assignment.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import day9assignment.beans.Covid;
import day9assignment.factory.ObjectFactory;
import day9assignments.business.CovidService;


@WebServlet("/CovidFindByName")
public class CovidFindByName extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
       public CovidFindByName() {
        super();
       }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
		
		CovidService service = new ObjectFactory().getServiceInstance();
		Covid vacdetail = service.fetchvacdetail(name);
		
		PrintWriter pw = response.getWriter();
		//pw.print("<html><body>");
		//pw.print(employee);
		//pw.print("</body></html>");
		
		Gson gson = new GsonBuilder().create();
		String vacdetailJSON = gson.toJson(vacdetail).toString(); // converts java object to json
		response.setContentType("application/json"); 
		pw.print(vacdetailJSON);
	}
	}

}
