package main;

import utilidades.GestorVideos;

public class Principal {
	public static void main(String[] args) {

		GestorVideos gestorVideos = new GestorVideos();
		gestorVideos.borrarVideo(55, 2);
		gestorVideos.borrarVideo("mivideo.mpeg");
	}

}
