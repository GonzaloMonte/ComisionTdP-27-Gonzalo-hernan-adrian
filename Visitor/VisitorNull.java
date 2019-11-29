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

public class VisitorNull extends Visitor{

	@Override
	public void visitAliado(Heroe a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitEnemigo(Enemigo e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitDisparo(Disparo d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitDisparoEne(DisparoEnemigo d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void VisitBomba(Bomba b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void VisitCorazon(Corazon c) {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

}
