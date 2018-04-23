package servletsAdmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import daos.UsuariosDAO;
import daosImpl.UsuariosDAOImpl;
import modelo.Usuario;

@WebServlet("/admin/ServletEditarUsuario")
public class ServletEditarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		UsuariosDAO usuariosDAO = new UsuariosDAOImpl();
		Usuario usuarioAeditar = usuariosDAO.obtenerUsuariosPorId(id);
		request.setAttribute("usuarioAeditar", usuarioAeditar);
		request.getRequestDispatcher("editarUsuario.jsp").forward(request, response);
	}//end service
}//end class
