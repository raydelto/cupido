package edu.itla.cupido.entidades;

public class Persona {
	private String nombre;
	private String apellido;
	private Sexo sexo;
	private float sueldo;
	private float peso;
	
	public Persona(String nombre, String apellido, Sexo sexo, float sueldo, float peso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.sueldo = sueldo;
		this.peso = peso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	
	@Override
	public String toString() {
		return nombre + " " + apellido;
	}
	
	

}
