package edu.itla.cupido.algoritmos;

import java.util.ArrayList;

import edu.itla.cupido.entidades.Persona;

public class AlgoritmoGrasoso implements AlgoritmoDeRecomendacion {

	@Override
	public Persona recomendar(Persona solicitante , ArrayList<Persona> candidatos) {
		Persona recomendado = null;
		for(Persona candidato : candidatos) {
			if(!candidato.getSexo().equals(solicitante.getSexo())) {
				if(recomendado == null) {
					recomendado = candidato;
				}else {
					if(candidato.getPeso() > recomendado.getPeso()) {
						recomendado = candidato;
					}
				}
			}
		}
		return recomendado;
	}

}
