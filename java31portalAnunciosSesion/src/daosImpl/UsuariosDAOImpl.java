package daosImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Usuario;
import daos.ConstantesSQL;
import daos.GenericDAO;
import daos.UsuariosDAO;

public class UsuariosDAOImpl extends GenericDAO implements UsuariosDAO{

	@Override
	public void registrarUsuario(Usuario usuario) {
		// siempre llamar a conectar() y desconectar()
		conectar();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.INSERCION_USUARIO);
			ps.setString(1, usuario.getNombre());
			ps.setString(2, usuario.getEmail());
			ps.setString(3, usuario.getPoblacion());
			ps.setString(4, usuario.getPass());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			System.out.println("la sql de insercion de usuario esta mal");
			System.out.println(e.getMessage());
		}

		desconectar();
		
	}

	@Override
	public List<Usuario> obtenerUsuarios() {
		conectar();
		List<Usuario> usuarios = new ArrayList<Usuario>();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.SELECCION_USUARIOS);
			ResultSet resultado = ps.executeQuery();
			while(resultado.next()){
				Usuario usuario = new Usuario();
				usuario.setNombre(resultado.getString("nombre"));
				usuario.setEmail(resultado.getString("email"));
				usuario.setPoblacion(resultado.getString("poblacion"));
				usuario.setPass(resultado.getString("contraseña"));
				usuario.setId(resultado.getInt("id"));
				usuarios.add(usuario);
			}//end while
		} catch (SQLException e) {
			System.out.println("sql select usuarios esta mal");
			System.out.println(e.getMessage());
		}
		
		desconectar();
		return usuarios;
	}

	@Override
	public boolean identificarUsuario(String email, String pass) {
		boolean identificado = false;
		conectar();
		try {
			PreparedStatement ps = miConexion.prepareStatement(ConstantesSQL.IDENTIFICACION_USUARIO);
			ps.setString(1, email);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				//si este if se cumple, eso es que he obtenido un resultado de base de datos
				identificado = true;
			}
		} catch (SQLException e) {
			System.out.println("sql de identificacion tiene problemas");
			System.out.println(e.getMessage());
		}		
		desconectar();
		return identificado;
	}

	@Override
	public boolean identificarAdmin(String email, String pass) {
		boolean identificado = false;
		conectar();
		try {
			PreparedStatement ps = miConexion.prepareStatement(ConstantesSQL.IDENTIFICACION_ADMIN);
			ps.setString(1, email);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				//si este if se cumple, eso es que he obtenido un resultado de base de datos
				identificado = true;
			}
		} catch (SQLException e) {
			System.out.println("sql de identificacion tiene problemas");
			System.out.println(e.getMessage());
		}		
		desconectar();
		return identificado;
	}

	@Override
	public void borrarUsuario(int id) {
		conectar();
		try {
			PreparedStatement ps = miConexion.prepareStatement(ConstantesSQL.BORRAR_USUARIO);
			ps.setInt(1, id);
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			System.out.println("la sql de borrar usuario esta mal");
			System.out.println(e.getMessage());
		}
		desconectar();
		
	}
	
}
