package edu.itla.cupido.configuracion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class GestorDeConfiguracion {
	private static GestorDeConfiguracion instancia;
	private Properties propiedades;
	
	public static GestorDeConfiguracion getInstancia() {
		if(instancia == null) {
			instancia = new GestorDeConfiguracion();
		}
		return instancia;
	}
	
	public String getPropiedad(String nombre) {
		return propiedades.getProperty(nombre);
	}
	
	private GestorDeConfiguracion() {
		//Asegurarnos que no se pueda instanciar directamente esta clase
		propiedades = new Properties();
		try {
			propiedades.load(new FileReader("config.ini"));
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
