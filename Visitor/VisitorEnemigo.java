package Visitor;

import Personajes.Disparo;
import Personajes.Enemigo;
import Personajes.Heroe;

public class VisitorEnemigo extends Visitor
{

	
	public void visitAliado(Heroe a) {
		a.crearDisparo();
		
	}

	
	public void visitEnemigo(Enemigo e) {
		
		
	}

	
	public void visitDisparo(Disparo d) {
		
		
	}

}
