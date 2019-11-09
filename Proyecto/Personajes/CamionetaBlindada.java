package Personajes;

import Objetos.Objeto;
import Main.Pair;

public class CamionetaBlindada extends Enemigo{
	CamionetaBlindada(Objeto Premio){	
		super(1000,30,Premio);
	}
	CamionetaBlindada(int x){
		super(1000,30,x);
	}
}
