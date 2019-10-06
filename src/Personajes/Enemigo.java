package Personajes;
import Objetos.*;
import Main.*;
	
	public class Enemigo extends Personaje{
		protected int velocidad; //
		protected int recompensa;//por matarlo en monedas o dolar se suma al dinero del jugador
		protected int daño;//No ataca a la ciudad ,sino que es el daño  al llegar a la base.
		protected Objeto premio; // No todos los enemigos dan premios
		protected Pair[] camino;
		protected Pair pos;
		protected int k;

		
		public Enemigo(int vida,int recompensa,int daño,Pair[] cam){
		 super(vida);
		 this.recompensa=recompensa;
		 this.daño=daño;
		 camino=cam;
		 k=0;
		 pos=camino[k];
				}
		public Enemigo(int vida,int recompensa,int daño,Objeto p,Pair[] p2){
			 super(vida);
			 this.recompensa=recompensa;
			 this.daño=daño;
			 premio =p;
			 camino=p2;
			 k=0;
			 pos=camino[k];

			}
		
		public int getVelocidad(){
			return velocidad;
		}
		
		public int getRecompensa(){
			return recompensa;
		}
		
		public int getDaño(){
			return daño;
		}
		/**
		 * 
		 * 
		 * @param a es el valor de daño del heroe que lo ataco
		 */
		public void atacado(int a){
			vida=vida-a;
		}
		public int getX(){
			return pos.getX();
		}
		
		public boolean llego(){
			return k==(camino.length-1);
		} 
		
		public int getY(){
			return pos.getY();
		}
		
		public void mover(){
			if(k<camino.length-1){
				k++;
				pos=camino[k];
			}
		}
		public void setVida(int i) {
			vida=i;
		}
		
	}
