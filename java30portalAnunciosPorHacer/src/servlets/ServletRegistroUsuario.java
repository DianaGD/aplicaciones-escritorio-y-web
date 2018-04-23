package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Anuncio;
import modelo.Usuario;
import daos.AnunciosDAO;
import daos.UsuariosDAO;
import daosImpl.AnunciosDAOImpl;
import daosImpl.UsuariosDAOImpl;

@WebServlet("/ServletRegistroUsuario")
public class ServletRegistroUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("se ejecuta el post del ServletRegistroUsuario");
		//vamos a recoger lo que ha introducido el usuario en el formulario
		
		//campoTitulo es el name del input del que quiero coger la informacion
		String nombre = request.getParameter("campoNombre");
		String email = request.getParameter("campoEmail");
		String poblacion = request.getParameter("campoPoblacion");
		String pass = request.getParameter("campoPass");
		//parte de validacion de datos
		//...
		//fin parte de validacion de datos
		Usuario nuevoUsuario = new Usuario(nombre, email, poblacion, pass);
		//ahora le damos el nuevo usuario a un DAO para que lo registre
		System.out.println("vamos a registrar: "+nuevoUsuario.toString());
		UsuariosDAO usuariosDAO = new UsuariosDAOImpl();
		usuariosDAO.registrarUsuario(nuevoUsuario);
		//desde un servlet no deberia mostrarle nada al usuario
		//para eso tenemos las jsp, que son las encargadas de
		//realizar la vista de la aplicacion
		
		//asi digo al server que siga la ejecucion en la siguiente jsp
		//java ya he terminado, ejecuta la jsp y dale la repuesta que corresponda
		request.getRequestDispatcher("registroUsuarioOK.jsp").forward(request, response);
	}

}
