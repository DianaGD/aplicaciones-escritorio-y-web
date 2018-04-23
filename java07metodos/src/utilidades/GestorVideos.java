package utilidades;

public class GestorVideos {

	public void borrarVideo(int id , int version) {
		System.out.println("Borrando vídeo id:" + id + " version:"+ version);
	}
	
	public void borrarVideo(String ruta) {
		System.out.println("borrando video de la ruta: " + ruta);
	}

}
