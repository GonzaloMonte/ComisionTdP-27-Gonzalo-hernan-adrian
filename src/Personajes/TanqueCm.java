package Personajes;
import Objetos.*;
import javafx.util.Pair;

public class TanqueCm extends Enemigo{
		public TanqueCm(Objeto Premio,Pair<Integer,Integer>[] p){	
			super(500,100,10,Premio,p);
		}
		public TanqueCm(Pair<Integer,Integer>[] p){
			super(500,100,10,p);
		}
	}
