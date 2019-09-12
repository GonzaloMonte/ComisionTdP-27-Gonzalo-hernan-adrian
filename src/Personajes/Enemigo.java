package Personajes;
import Objetos.*;
	public abstract class Enemigo extends Personaje{
		protected int velocidad; //
		protected int recompensa;//por matarlo en monedas o dolar se suma al dinero del jugador
		protected int da�o;//No ataca a la ciudad ,sino que es el da�o  al llegar a la base.
		protected Objeto premio; // No todos los enemigos dan premios 
		Enemigo(int vida,int recompensa,int da�o){
		 super(vida);
		 this.recompensa=recompensa;
		 this.da�o=da�o;
		}
		public Enemigo(int vida,int recompensa,int da�o,Objeto p){
			 super(vida);
			 this.recompensa=recompensa;
			 this.da�o=da�o;
			 premio =p;
			}
		
		int getVelocidad(){
			return velocidad;
		}
		
		int getRecompensa(){
			return recompensa;
		}
		
		int getDa�o(){
			return da�o;
		}
		/**
		 * 
		 * 
		 * @param a es el valor de da�o del heroe que lo ataco
		 */
		void atacado(int a){
			da�o=da�o-a;
		}
		
	}
