package edu.itla.cupido;

import java.util.ArrayList;

import edu.itla.cupido.algoritmos.AlgoritmoDeRecomendacion;
import edu.itla.cupido.algoritmos.AlgoritmoGrasoso;
import edu.itla.cupido.configuracion.GestorDeConfiguracion;
import edu.itla.cupido.entidades.Persona;
import edu.itla.cupido.entidades.Sexo;

public class Sistema {
	public static void main(String[] args) {
		ArrayList<Persona> candidatos = new ArrayList<Persona>();
		GestorDeConfiguracion config = GestorDeConfiguracion.getInstancia();
		candidatos.add(new Persona("Shakira","Medabar", Sexo.Femenino, 1000000.00f,123.45f));
		candidatos.add(new Persona("Chachita","Casado", Sexo.Femenino, 1000.00f,423.45f));
		candidatos.add(new Persona("Ricky","Martin", Sexo.Masculino, 9000000.00f,193.45f));
		Persona solicitante = new Persona("Freddy","Lopez", Sexo.Masculino, 800.00f,193.45f);
		candidatos.add(solicitante);
		AlgoritmoDeRecomendacion algoritmo = null;
		try {
			algoritmo = (AlgoritmoDeRecomendacion) Class.forName(config.getPropiedad("algoritmo")).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(algoritmo == null) {
			System.err.println("No se pudo encontrar algoritmo de recomendación");
		}else {
			Persona recomendado = algoritmo.recomendar(solicitante, candidatos);
			System.out.println("Se ha recomendado a " + recomendado);
		}				
	}
}
