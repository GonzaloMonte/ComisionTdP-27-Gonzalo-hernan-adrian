package Main;

import Personajes.Personaje;

public class Celda {
	protected int i,j;
	protected Personaje personaje;
	public Celda(int i, int j) {
		this.i=i;
		this.j=j;
		personaje=null;
	}
	public String queSoy() {
		return "vacio";
	} 
	
	public boolean ocupada(){
		if(personaje==null)
			return false;
		else return true;
	}
	public void agregarPersonaje(Personaje p) {
		personaje=p;
	}
	
	
	
	
}
