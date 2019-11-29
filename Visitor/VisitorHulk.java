package Visitor;

import Objetos.Piedra;
import Personajes.Enemigo;

public class VisitorHulk extends VisitorHeroes {
	int da�o;
	public VisitorHulk(int d) {
		da�o=d;
	}
	public void visitEnemigo(Enemigo e) {
		e.atacado(da�o);		
	}
	public void VisitPiedra(Piedra p) {
		p.atacado(da�o);
		
	}
}
