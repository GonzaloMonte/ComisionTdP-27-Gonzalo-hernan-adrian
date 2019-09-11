package Personajes;

import Objetos.*;

public class Nave extends Enemigo{
	Nave(Objeto Premio){	
		super(4000,200,30,Premio);
	}
	Nave(){
		super(4000,200,30);
	}
}
