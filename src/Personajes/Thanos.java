package Personajes;

import Objetos.*;
import javafx.util.Pair;

public class Thanos extends Enemigo{
	public Thanos(Objeto Premio,Pair<Integer,Integer>[] p){	
		super(15000,500,90,Premio,p);
	}
	public Thanos(Pair<Integer,Integer>[] p){
		super(150000,500,90,p);
	}
}
