package edu.itla.cupido.algoritmos;

import java.util.ArrayList;

import edu.itla.cupido.entidades.Persona;

public interface AlgoritmoDeRecomendacion {
	public Persona recomendar(Persona solicitante, ArrayList<Persona> candidatos);

}
