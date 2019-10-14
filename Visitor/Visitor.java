package Visitor;

import Personajes.*;

public abstract class Visitor {
	
	protected Entidad miEntidad;
	
	public abstract void visitAliado(Heroe a);
	
	public abstract void visitEnemigo(Enemigo e);
		
	public abstract void visitDisparo(Disparo d);



}
