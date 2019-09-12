package Personajes;

import Objetos.*;

public class Robot extends Enemigo{
	
	public Robot(Objeto Premio){	
		super(4000,300,30,Premio);
	}
	public Robot(){
		super(4000,300,30);
	}
}
