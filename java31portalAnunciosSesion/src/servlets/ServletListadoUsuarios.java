package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.UsuariosDAO;
import daosImpl.UsuariosDAOImpl;

/**
 * Servlet implementation class ServletListadoUsuarios
 */
@WebServlet("/ServletListadoUsuarios")
public class ServletListadoUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuariosDAO daoUsuario = new UsuariosDAOImpl();
		
		request.setAttribute("usuarios", daoUsuario.obtenerUsuarios());
		request.getRequestDispatcher("listadoUsuarios.jsp").forward(request, response);
	}


}
