package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;
import model.Auto;
import model.dao.Dao;
 * 
 * */

import org.json.JSONObject;

import model.Auto;
import model.dao.Dao;

/**
 * Servlet implementation class Autot
 */
			// End point 
@WebServlet("/autot")
public class Autot extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Autot() {
        super();
        System.out.println("Autot.Autot()");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Autot.doGet()");
		Dao dao = new Dao();
		ArrayList<Auto> autot = dao.listaaKaikki();
		System.out.println(autot);
		
		/* 
		 * Lis‰‰ /WebContent/WEB-INF/lib kansioon  
		 * 
		 * */
		String strJSON = new JSONObject().put("autot", autot).toString();
		
		response.setContentType("applicatiion/json");
		PrintWriter out = response.getWriter();
		out.println(strJSON);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Autot.doPost()");
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Autot.doPut()");
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Autot.doDelete()");
	}

}
