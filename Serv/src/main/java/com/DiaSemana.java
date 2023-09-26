package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class DiaSemana
 */
public class DiaSemana extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DiaSemana() {
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
        
        Integer numero = Integer.parseInt(request.getParameter("dia"));
        String diaDeLaSemana;
        
        switch (numero) {
            case 1:
                diaDeLaSemana = "El dia correspondidente es Lunes";
                break;
            case 2:
                diaDeLaSemana = "El dia correspondidente es Martes";
                break;
            case 3:
                diaDeLaSemana = "El dia correspondidente es Miércoles";
                break;
            case 4:
                diaDeLaSemana = "El dia correspondidente es Jueves";
                break;
            case 5:
                diaDeLaSemana = "El dia correspondidente es Viernes";
                break;
            case 6:
                diaDeLaSemana = "El dia correspondidente es Sábado";
                break;
            case 7:
                diaDeLaSemana = "El dia correspondidente es Domingo";
                break;
            default:
                diaDeLaSemana = "Número fuera de rango";
        }
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Dia de la semana</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>" + diaDeLaSemana + "</h1>");
        out.println("</body>");
        out.println("</html>");
	}

}
