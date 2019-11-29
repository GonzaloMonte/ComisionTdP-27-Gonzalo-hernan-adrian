package Visitor;

import Main.Mapa;
import Objetos.Bomba;
import Objetos.Congelador;
import Objetos.Corazon;
import Objetos.Escudo;
import Objetos.Piedra;
import Personajes.Disparo;
import Personajes.DisparoEnemigo;
import Personajes.Enemigo;
import Personajes.Heroe;

public class VisitorVender extends Visitor{


	public void visitAliado(Heroe a) {
		Mapa.mapa.setDinero(a.getPrecio());
		a.destruir();
		Mapa.mapa.activarVender();
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
