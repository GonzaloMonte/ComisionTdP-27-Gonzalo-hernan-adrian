package Personajes;

import Objetos.*;

public class Thanos extends Enemigo{
	public Thanos(Objeto Premio){	
		super(15000,500,90,Premio);
	}
	public Thanos(){
		super(150000,500,90);
	}
}
