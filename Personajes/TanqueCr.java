package Personajes;

import Main.Pair;
import Objetos.*;

public class TanqueCr extends Enemigo{
	public TanqueCr(Pair[] p){	
		super(200,15,90,p);
	}
	public TanqueCr(Objeto o,Pair[] p){
		super(200,15,90,o,p);
	} 
	public TanqueCr clone(){
		return new TanqueCr(camino);
	}
	public TanqueCr clone(Objeto o){
		return new TanqueCr(o,camino);
	} 
}