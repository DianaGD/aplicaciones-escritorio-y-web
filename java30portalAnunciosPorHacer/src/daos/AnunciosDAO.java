package daos;

import java.util.List;

import modelo.Anuncio;

public interface AnunciosDAO {
	//por defecto los m�todos de una interfaz son public abstract
	void registrarAnuncio(Anuncio anuncio);
	
	List<Anuncio> obtenerAnuncios();
	
	
}
