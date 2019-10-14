package Personajes;

import Visitor.*;

public abstract class Entidad {
		int vida;
		Visitor visitor;
		int x;
		int y;
		public Entidad(int vida){
			this.vida=vida;
		}
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
		public int getVida(){	 
			return vida;
	    }
		
		public String queSoy() {
			return "vacio";
		}
		public abstract void accept(Visitor v);

		public abstract void actualizar();
		
		public abstract Visitor getVisitor();
		
		//{}
		
		
		
		
}
