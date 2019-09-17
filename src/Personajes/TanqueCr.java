package Personajes;

import Objetos.*;
import javafx.util.Pair;

public class TanqueCr extends Enemigo{
	public TanqueCr(Pair<Integer,Integer>[] p){	
		super(200,15,90,p);
	}
	public TanqueCr(Objeto o,Pair<Integer,Integer>[] p){
		super(200,15,90,o,p);
	} 
}
