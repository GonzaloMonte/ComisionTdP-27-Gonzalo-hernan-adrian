package Personajes;

import Objetos.*;

public class Thanos extends Enemigo{
	Thanos(Objeto Premio){	
		super(15000,500,90,Premio);
	}
	Thanos(){
		super(150000,500,90);
	}
}
