package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class TiempoViaje
 */
public class TiempoViaje extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TiempoViaje() {
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
        
        double distancia = Double.parseDouble(request.getParameter("distancia"));
        double velocidad = Double.parseDouble(request.getParameter("velocidad"));
        
        double tiempo = distancia / velocidad;
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Tiempo de Viaje</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>El tiempo de viaje es: " + tiempo + " horas</h1>");
        out.println("</body>");
        out.println("</html>");
    }

}
