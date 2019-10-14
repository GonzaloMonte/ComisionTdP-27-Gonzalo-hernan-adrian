package Personajes;

import Main.Pair;
import Objetos.*;

public class Robot extends Enemigo{
	
	public Robot(Objeto Premio,Pair[] p){	
		super(4000,300,30,Premio,p);
	}
	public Robot(Pair[] p){
		super(4000,300,30,p);
	}
}
