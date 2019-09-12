package Personajes;
import Objetos.*;
	public abstract class Enemigo extends Personaje{
		protected int velocidad; //
		protected int recompensa;//por matarlo en monedas o dolar se suma al dinero del jugador
		protected int daño;//No ataca a la ciudad ,sino que es el daño  al llegar a la base.
		protected Objeto premio; // No todos los enemigos dan premios 
		Enemigo(int vida,int recompensa,int daño){
		 super(vida);
		 this.recompensa=recompensa;
		 this.daño=daño;
		}
		public Enemigo(int vida,int recompensa,int daño,Objeto p){
			 super(vida);
			 this.recompensa=recompensa;
			 this.daño=daño;
			 premio =p;
			}
		
		int getVelocidad(){
			return velocidad;
		}
		
		int getRecompensa(){
			return recompensa;
		}
		
		int getDaño(){
			return daño;
		}
		/**
		 * 
		 * 
		 * @param a es el valor de daño del heroe que lo ataco
		 */
		void atacado(int a){
			daño=daño-a;
		}
		
	}
