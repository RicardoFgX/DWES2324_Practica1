package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CategorizacionEdades
 */
public class CategorizacionEdades extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategorizacionEdades() {
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
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        Integer edad = Integer.parseInt(request.getParameter("edad"));
        String categoria;
		
        
        if (edad < 12) {
            categoria = "Infante";
        } else if (edad >= 12 && edad <= 17) {
            categoria = "Adolescente";
        } else if (edad >= 18 && edad <= 60) {
            categoria = "Adulto";
        } else {
            categoria = "Anciano";
        }
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Dia de la semana</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Tu categoría de edad es: " + categoria + "</h1>");
        out.println("</body>");
        out.println("</html>");
	}

}
