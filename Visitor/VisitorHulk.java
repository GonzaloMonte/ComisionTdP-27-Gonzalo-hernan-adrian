package Visitor;

import Objetos.Piedra;
import Personajes.Enemigo;

public class VisitorHulk extends VisitorHeroes {
	int daño;
	public VisitorHulk(int d) {
		daño=d;
	}
	public void visitEnemigo(Enemigo e) {
		e.atacado(daño);		
	}
	public void VisitPiedra(Piedra p) {
		p.atacado(daño);
		
	}
}
