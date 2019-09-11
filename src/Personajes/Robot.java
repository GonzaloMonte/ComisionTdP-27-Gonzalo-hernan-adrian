package Personajes;

import Objetos.*;

public class Robot extends Enemigo{
	Robot(Objeto Premio){	
		super(4000,300,30,Premio);
	}
	Robot(){
		super(4000,300,30);
	}
}
