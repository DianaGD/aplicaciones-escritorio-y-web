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
 * Servlet implementation class ServletIdentificacionUsuario
 */
@WebServlet("/ServletIdentificacionUsuario")
public class ServletIdentificacionUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//el metodo service atiende tanto peticiones tipo get como tipo post
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("campoEmail");
		String pass = request.getParameter("campoPass");
		System.out.println("Voy a registrar a email: "+email+"contraseña: "+pass);
		UsuariosDAO usuariosDAO = new UsuariosDAOImpl();
		if(usuariosDAO.identificarUsuario(email, pass)){
			//usuario identificado correctamente
			//para obtener la sesion en un servlet
			request.getSession().setAttribute("identificado", "ok");
			request.getRequestDispatcher("loginOK.jsp").forward(request, response);
		}else{
			//email y/o pass incorrectos
			request.setAttribute("mensaje", "email y/o pass incorrectos");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}//end else
	}//end service

}//end class
