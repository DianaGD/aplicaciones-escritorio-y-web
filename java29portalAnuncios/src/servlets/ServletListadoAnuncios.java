package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.AnunciosDAO;
import daosImpl.AnunciosDAOImpl;

/**
 * Servlet implementation class ServletListadoAnuncios
 */
@WebServlet("/ServletListadoAnuncios") //ruta que va a hacer que se dispare este servlet
public class ServletListadoAnuncios extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		AnunciosDAO daoAnuncio = new AnunciosDAOImpl();
		
		//asi continuo en listadoAnuncios.jsp, al cual le tengo que dar
		//los anuncios que me de el DAO
		request.setAttribute("anuncios", daoAnuncio.obtenerAnuncios());
		request.getRequestDispatcher("listadoAnuncios.jsp").forward(request, response);
		
	}//end doGet

}//end class
