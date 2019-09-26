package Personajes;

import Objetos.Objeto;
import Main.Pair;

public class CamionetaBlindada extends Enemigo{
	CamionetaBlindada(Objeto Premio,Pair[] p){	
		super(1000,100,30,Premio,p);
	}
	CamionetaBlindada(Pair[] p){
		super(1000,100,30,p);
	}
}
