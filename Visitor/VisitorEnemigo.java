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

public class VisitorEnemigo extends Visitor
{

	
	public void visitAliado(Heroe a) {
		a.crearDisparo();
		
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

	public void VisitCongelar(Congelador c) {
		
		
	}


	public void VisitPiedra(Piedra p) {
		
		
	}

}
