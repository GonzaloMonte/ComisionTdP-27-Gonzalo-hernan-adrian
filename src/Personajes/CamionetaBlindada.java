package Personajes;

import Objetos.Objeto;

public class CamionetaBlindada extends Enemigo{
	CamionetaBlindada(Objeto Premio){	
		super(1000,100,30,Premio);
	}
	CamionetaBlindada(){
		super(1000,100,30);
	}
}
