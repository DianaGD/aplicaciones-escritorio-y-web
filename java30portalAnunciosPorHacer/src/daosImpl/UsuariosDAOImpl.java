package daosImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Anuncio;
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
				usuario.setPass(resultado.getString("pass"));
				usuarios.add(usuario);
			}//end while
		} catch (SQLException e) {
			System.out.println("sql select usuarios esta mal");
		}
		
		desconectar();
		return usuarios;
	}
	
}
