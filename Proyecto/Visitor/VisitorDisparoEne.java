package Visitor;

import Objetos.Bomba;
import Objetos.Congelador;
import Objetos.Corazon;
import Objetos.Escudo;
import Objetos.Piedra;
import Personajes.Disparo;
import Personajes.DisparoEnemigo;
import Personajes.Enemigo;
import Personajes.Heroe;

public class VisitorDisparoEne extends Visitor {

	protected int daño;
	public VisitorDisparoEne(int d) {
		daño=d;
	}
	public void visitAliado(Heroe a) {
			a.atacado(daño);
	}

	public void visitEnemigo(Enemigo e) {
	}

	public void visitDisparo(Disparo d) {

		
	}

	public void visitDisparoEne(DisparoEnemigo d) {
	
		
	}
	
	public void VisitBomba(Bomba b) {
		
		
	}
	
	public void VisitCorazon(Corazon c) {
		
		
	}
	@Override
	public void VisitEscudo(Escudo c) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void VisitCongelar(Congelador c) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void VisitPiedra(Piedra p) {
		p.atacado(daño);
		
	}

}
