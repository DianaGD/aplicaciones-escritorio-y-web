package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class PrincipalLecturaEscrituraArchivo {

	public static void main(String[] args) {
		//leer(input) y escribir(output) binario (imagen)
		//como si estuvieramos haciendo una copia de una imagen original.jpg
		try {
			FileInputStream fis = new FileInputStream("original.jpg");
			FileOutputStream fos = new FileOutputStream("destino.jpg");
			
			//antes de leer creamos un array de 1024 bytes
			byte[] leido = new byte[1024];
			int bytesLeidos=0; //para saber cuantos bytes se van leyendo
			
//			System.out.println("leido: "+Arrays.toString(leido));//imprime los bytes de la imagen

//			while(bytesLeidos!=-1){//-1 es que ya no queda nada más por leer
//				bytesLeidos=fis.read(leido); //vuelca en leido los primeros 1024 bytes de original.jpg
//				System.out.println("bytes leidos: "+bytesLeidos);
//				if(bytesLeidos!=-1){
//					fos.write(leido);
//				}
//			}	
			//lo que siempre vamos a ver es esto:
			//el siguiente codigo es identico al anterior
			while((bytesLeidos=fis.read(leido))!=-1){
				fos.write(leido);
			}
			
			fis.close();
			fos.close();
			System.out.println("lectura/escritura bytes ok");
		} catch (FileNotFoundException e) {
			System.out.println("archivo no encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("no pude leer o escribir bytes");
			e.printStackTrace();
		}

	}

}
