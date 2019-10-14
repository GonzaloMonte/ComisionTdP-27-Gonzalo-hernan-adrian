package Personajes;

import Main.Pair;
import Objetos.*;

public class Nave extends Enemigo{
	public Nave(Objeto Premio,Pair[] p){	
		super(4000,200,30,Premio,p);
	}
	public Nave(Pair[] p){
		super(4000,200,30,p);
	}
}
