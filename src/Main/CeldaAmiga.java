package Main;

import Personajes.Heroe;

public class CeldaAmiga extends Celda {
		protected Heroe heroe=null;
	
		public CeldaAmiga(int i, int j) {
			super(i, j);
		}

	
		public String queSoy() {
			if (personaje==null) 
				return "celdaAliada";
			else
				return "ironman";
		}
		
		public Heroe getHeroe(){
			return heroe;		
		}
}
