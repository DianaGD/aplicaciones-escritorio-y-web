package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = { "/ServletInicio" })
public class ServletInicio extends HttpServlet {
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("se ejecuto el doGet de ServletInicio");
		//request contiene información de la peticion que ha hecho el cliente
		//se puede sacar mucha informacion de ella
		System.out.println("ip del cliente: " + request.getLocalAddr());
		String navegadorDelUsuario = request.getHeader("User-Agent");
		System.out.println("navegador del cliente: "+navegadorDelUsuario);
		//response es la respuesta que va a recibir el cliente
		response.getWriter().println("respuesta desde el servlet");
		//lo que el usuario va a recibir siempre es html y su navegador lo va a representar
		response.getWriter().println("<a href='ServletNoticias'>");
		response.getWriter().println("ir a la seccion de noticias");
		response.getWriter().println("</a>");
		
	}//end doGet

}//end class
