package Personajes;

	public abstract class Personaje {
		int vida;
		Personaje(int vida){
			this.vida=vida;
		}
		
		public int getVida(){	 
			return vida;
	    }
		
		public String queSoy() {
			return "vacio";
		}
		
		
}
