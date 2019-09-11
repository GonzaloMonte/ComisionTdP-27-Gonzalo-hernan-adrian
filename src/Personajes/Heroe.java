package Personajes;

	public abstract class Heroe extends Personaje{
		protected int da�o;
		protected boolean aereo=false;
		protected int alcance;
		public Heroe(int vida,int d,int a){
		 super(vida);
		 da�o=d;
		 alcance=a;
		}
		int getDa�o(){
			return da�o;	
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
			da�o=da�o+((40*da�o)/100);
		}
	
	}
