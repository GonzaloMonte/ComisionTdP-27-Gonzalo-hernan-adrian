package Visitor;

import Objetos.Bomba;
import Objetos.Congelador;
import Objetos.Corazon;
import Objetos.Escudo;
import Objetos.Piedra;
import Personajes.*;

public abstract class Visitor {
	
	protected Entidad miEntidad;
	
	public abstract void visitAliado(Heroe a);
	
	public abstract void visitEnemigo(Enemigo e);
		
	public abstract void visitDisparo(Disparo d);

	public abstract void visitDisparoEne(DisparoEnemigo d);
	
	public abstract void VisitBomba(Bomba b);
	
	public abstract void VisitCorazon(Corazon c);
	
	public abstract void VisitEscudo(Escudo c);
	
	public abstract void VisitCongelar(Congelador c);
	
	public abstract void VisitPiedra(Piedra p);
}
