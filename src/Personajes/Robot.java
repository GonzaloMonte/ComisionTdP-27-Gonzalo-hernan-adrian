package Personajes;

import Objetos.*;
import javafx.util.Pair;

public class Robot extends Enemigo{
	
	public Robot(Objeto Premio,Pair<Integer,Integer>[] p){	
		super(4000,300,30,Premio,p);
	}
	public Robot(Pair<Integer,Integer>[] p){
		super(4000,300,30,p);
	}
}
