package Personajes;

import Main.Pair;
import Objetos.*;

public class Nave extends Enemigo{
	public Nave(Objeto Premio){	
		super(4000,30,Premio);
	}
	public Nave(int x){
		super(4000,30,x);
	}
}
