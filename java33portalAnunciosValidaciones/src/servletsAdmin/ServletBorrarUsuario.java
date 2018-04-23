package servletsAdmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import daos.UsuariosDAO;
import daosImpl.UsuariosDAOImpl;

@WebServlet("/admin/ServletBorrarUsuario")
public class ServletBorrarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("borrar usuario de id: " + id);
		UsuariosDAO usuariosDAO = new UsuariosDAOImpl();
		usuariosDAO.borrarUsuario(id);
		request.setAttribute("usuarios", usuariosDAO.obtenerUsuarios());
		request.getRequestDispatcher("ServletListadoUsuariosAdmin").forward(request, response);
	}
}
