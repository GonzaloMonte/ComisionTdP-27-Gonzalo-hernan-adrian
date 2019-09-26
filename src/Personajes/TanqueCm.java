package Personajes;
import Objetos.*;
import Main.Pair;

public class TanqueCm extends Enemigo{
		public TanqueCm(Objeto Premio,Pair[] p){	
			super(500,100,10,Premio,p);
		}
		public TanqueCm(Pair[] p){
			super(500,100,10,p);
		}
	}
