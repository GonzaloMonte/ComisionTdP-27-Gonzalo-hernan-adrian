package Main;

import Personajes.*;

public class Celda {
	protected int i,j;
	protected Entidad personaje;
	
	public Celda(int i, int j) {
		this.i=i;
		this.j=j;
		personaje=null;
	}
	public String queSoy() {
		return "vacio";
	} 
	
	public boolean ocupada(){
		return false;
	}
	public void agregarPersonaje(Entidad p) {
		personaje=p;
	}
	
	public Entidad obtenerEntidad(){	
		return personaje;
	}
	
	
}
