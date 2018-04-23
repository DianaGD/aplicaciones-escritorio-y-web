package diana.aprendiendoSpring;

import modelo.Apuesta;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.ApuestasDAOImpl;

public class App 
{
    public static void main( String[] args )
    {
        //vamos a aprender Spring 
    	//spring se basa en un contenedor de instancias
    	//dicho contenedor, se le llama contexto de spring
    	
    	
    	//la forma más comun de crear ese contenedor
    	//es diciendo a spring por un xml, que objetos
    	//va a tener el contenedor    	
    	//dicho xml, se le suele llamar applicationContext.xml
    	
    	//crear un contenedor con todo lo que este puesto en el applicationContext.xml
    	//ese contenedor sera reutilizado a lo largo de la aplicación
    	
    	ClassPathXmlApplicationContext contenedor = 
    			new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	//ahora cuando queramos un objeto del contenedor lo podemos pedir asi
    	ApuestasDAOImpl dao = contenedor.getBean("apuestasDAOImpl", ApuestasDAOImpl.class);
    	Apuesta a = new Apuesta();
    	a.setNombre("nombre de la apuesta");
    	a.setCampo1("valor campo 1");
    	dao.registrarApuesta(a);
    	
    }
}
