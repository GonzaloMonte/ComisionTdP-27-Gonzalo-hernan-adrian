package Personajes;

import Objetos.*;
import javafx.util.Pair;

public class Nave extends Enemigo{
	public Nave(Objeto Premio,Pair<Integer,Integer>[] p){	
		super(4000,200,30,Premio,p);
	}
	public Nave(Pair<Integer,Integer>[] p){
		super(4000,200,30,p);
	}
}
