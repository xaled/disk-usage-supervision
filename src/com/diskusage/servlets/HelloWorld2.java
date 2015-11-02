package com.diskusage.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HelloName")
public class HelloWorld2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public HelloWorld2() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = "World";
		if(request.getParameter("name")!=null){
			name = request.getParameter("name");
		}
		request.setAttribute("name", name);
		getServletContext().getRequestDispatcher("/test.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
