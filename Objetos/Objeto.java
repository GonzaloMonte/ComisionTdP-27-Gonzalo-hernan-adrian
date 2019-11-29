package Objetos;

import Personajes.Entidad;

public abstract class Objeto extends Entidad {

	public Objeto(int vida) {
		super(vida);

	}
 public void SetPosicion(int x,int y) {
	 this.x=x;
	 this.y=y;
 }
}
