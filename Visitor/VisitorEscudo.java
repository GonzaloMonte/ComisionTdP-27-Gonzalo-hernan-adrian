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

public class VisitorEscudo extends Visitor {


	public void visitAliado(Heroe a) {
		a.activarEscudo();
		
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

	
	public void VisitEscudo(Escudo c) {
		
		
	}

	@Override
	public void VisitCongelar(Congelador c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void VisitPiedra(Piedra p) {
		// TODO Auto-generated method stub
		
	}

}
