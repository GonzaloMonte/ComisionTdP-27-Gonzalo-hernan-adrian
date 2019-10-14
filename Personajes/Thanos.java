package Personajes;

import Objetos.*;
import Main.Pair;

public class Thanos extends Enemigo{
	public Thanos(Objeto Premio,Pair[] p){	
		super(15000,500,90,Premio,p);
	}
	public Thanos(Pair[] p){
		super(150000,500,90,p);
	}
}
