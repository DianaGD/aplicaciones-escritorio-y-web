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

@WebServlet("/admin/ServletGuardarCambiosUsuario")
public class ServletGuardarCambiosUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("campoNombre");
		String email = request.getParameter("campoEmail");
		String poblacion= request.getParameter("campoPoblacion");
		String contraseña = request.getParameter("campoPass");
		String id = request.getParameter("campoId");
		
		//ahora deberiamos validar todos los datos
		//...
		//fin parte validacion
		Usuario usuario = new Usuario(nombre, email, poblacion, contraseña);
		usuario.setId(Integer.parseInt(id));
		
		UsuariosDAO usuariosDAO = new UsuariosDAOImpl();
		usuariosDAO.guardarCambiosUsuarios(usuario);
		request.getRequestDispatcher("ServletListadoUsuariosAdmin").forward(request, response);
	}//end service
}//end class
