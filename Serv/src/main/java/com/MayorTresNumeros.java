package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MayorTresNumeros
 */
public class MayorTresNumeros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MayorTresNumeros() {
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
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        double num3 = Double.parseDouble(request.getParameter("num3"));
        
        double mayor;
        if(num1>num2) {
        	if(num1>num3) {
        		mayor = num1;
        	} else {
        		mayor = num3;
        	}
        } else {
        	if(num2>num3) {
        		mayor=num2;
        	} else {
        		mayor=num3;
        	}
        }
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Mayor de Tres</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>El mayor de los 3 numeros es: " + mayor + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }

}
