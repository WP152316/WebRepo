package org.dimigo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.google.gson.JsonObject;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		System.out.printf("id : %s, pwd : %s\n",id,pwd);
		/*
		 * {
		 * 	"id : "test"
		 * }
		 */
//		out.println("{");
//		out.println("\"id\" : " + "\"" + id + "\"");
//		out.println("}");

		//Json simple library 사용
//
//		JSONObject json = new JSONObject();
//		json.put("id", id);
//		System.out.println(json.toJSONString());
//		out.write(json.toJSONString());
//		
			//Gson library를 사용하도록 소스 작성하기

		JsonObject json = new JsonObject();
		json.addProperty("id", id);
		System.out.println(json.toString());
		out.write(json.toString());			
		out.close();
	}
}
/*
 * 
 * 
 * 
*/