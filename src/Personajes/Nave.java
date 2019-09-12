package Personajes;

import Objetos.*;

public class Nave extends Enemigo{
	public Nave(Objeto Premio){	
		super(4000,200,30,Premio);
	}
	public Nave(){
		super(4000,200,30);
	}
}
