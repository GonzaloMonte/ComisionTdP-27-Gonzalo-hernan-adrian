package Personajes;

import Visitor.*;

public abstract class Entidad {
		int vida;
		Entidad(int vida){
			this.vida=vida;
		}
		
		public int getVida(){	 
			return vida;
	    }
		
		public String queSoy() {
			return "vacio";
		}
		public abstract void accept(Visitor v);

		public void atacar(Entidad e){
			
		}
		//{}
		
		
		
		
}
