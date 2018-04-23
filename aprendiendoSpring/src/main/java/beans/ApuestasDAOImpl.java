package beans;

import javax.annotation.Resource;

import modelo.Apuesta;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class ApuestasDAOImpl {
	
	private String urlConexion="";
	
	@Autowired
	private SessionFactory sessionFactory;
	//autowired indica a spring que coja otra bean disponible en el contenedor del mismo tipo que la propiedad indicada
	//@Autowired
	//una opcion mas segura, es indicar la bean que queremos con su id, para eso se usa @Resource
	//@Resource(name="idDeLaBeanQueSeAsignaAElPrivateUsuariosDAOImplUsuariosDAOImpl")
	@Autowired
	private UsuariosDAOImpl usuariosDAOImpl;
	
	
	public void registrarApuesta(Apuesta apuesta){
		sessionFactory.getCurrentSession().save(apuesta);
	}
	
	public void cancelarApuesta (int id){
		
		System.out.println("conectando: "+urlConexion);
		System.out.println("cancelando apuesta de id: "+id);
		System.out.println("voy viendo el dinero a quien apostó...");
		usuariosDAOImpl.devolverDineroApuesta(id, 13);
	}

	public String getUrlConexion() {
		return urlConexion;
	}


	public void setUrlConexion(String urlConexion) {
		this.urlConexion = urlConexion;
	}

	public UsuariosDAOImpl getUsuariosDAOImpl() {
		return usuariosDAOImpl;
	}

	public void setUsuariosDAOImpl(UsuariosDAOImpl usuariosDAOImpl) {
		this.usuariosDAOImpl = usuariosDAOImpl;
	}

}
