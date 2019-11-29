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

public class VisitorMapa extends Visitor {

	
	public void visitAliado(Heroe a) {
		
	}


	public void visitEnemigo(Enemigo e) {
		
		
	}

	
	public void visitDisparo(Disparo d) {
		
		
	}

	
	public void visitDisparoEne(DisparoEnemigo d) {
		
		
	}

	public void VisitBomba(Bomba b) {
		b.destruir();
		Mapa.mapa.setBombas(Mapa.mapa.getBombas()+1);		
	}

	
	public void VisitCorazon(Corazon c) {
		Mapa.mapa.curarBase(50);
		c.destruir();
	}


	public void VisitEscudo(Escudo c) {
		Mapa.mapa.activador(c);
			c.destruir();
		
	}



	public void VisitCongelar(Congelador c) {
		Mapa.mapa.activador(c);
		c.destruir();
		
	}



	public void VisitPiedra(Piedra p) {
		
		
	}

}
