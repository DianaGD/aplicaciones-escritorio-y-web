package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Producto;
import daos.ProductosDAO;
import daosImpl.ProductosDAOImpl;

@WebServlet("/ServletListadoProductos")
public class ServletListadoProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductosDAO dao = new ProductosDAOImpl();
		List<Producto> productos = dao.obtenerProductos();
		request.setAttribute("productos", productos);
		request.getRequestDispatcher("listadoProductos.jsp").forward(request, response);
	}

}
