package Main;

import Personajes.*;
import javax.swing.*;

public class Celda {
	protected int i,j;
	protected Entidad personaje;
	protected JLabel icono;
	
	public Celda(int i, int j) {
		this.i=i;
		this.j=j;
		personaje=null;
		icono=new JLabel();
		icono.setIcon(new ImageIcon("img\\celdaAliada.jpg"));
	}
	public JLabel getLabel() {
		if (personaje!=null) {
			return personaje.getLabel();
		}
		return icono;
	} 
	
	public boolean ocupada(){
		if (personaje!=null) {
			return true;
		}
		return false;
	}
	public void agregarPersonaje(Entidad p) {
		personaje=p;
	}
	
	public Entidad obtenerEntidad(){	
		return personaje;
	}
	public void liberarCelda() {
		personaje=null;
		
	}
	
}
