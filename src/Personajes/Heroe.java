package Personajes;

	public abstract class Heroe extends Personaje{
		protected int daño;
		protected boolean aereo=false;
		protected int alcance;
		public Heroe(int vida,int d,int a){
		 super(vida);
		 daño=d;
		 alcance=a;
		}
		int getDaño(){
			return daño;	
		}
		
		int getAlcance(){
			return alcance;	
		}
		boolean getAereo(){
			return aereo;
		}
		/**
		 * El jugador quiere mejorar al heroe ;
		 * 
		 */
		void Mejorar(){
			daño=daño+((40*daño)/100);
		}
	
	}
