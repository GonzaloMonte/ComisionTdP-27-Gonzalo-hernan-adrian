package Personajes;

import Objetos.Objeto;
import javafx.util.Pair;

public class CamionetaBlindada extends Enemigo{
	CamionetaBlindada(Objeto Premio,Pair<Integer,Integer>[] p){	
		super(1000,100,30,Premio,p);
	}
	CamionetaBlindada(Pair<Integer,Integer>[] p){
		super(1000,100,30,p);
	}
}
