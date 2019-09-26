package Personajes;
import Objetos.*;

import Main.*;
	public abstract class Enemigo extends Personaje{
		protected int velocidad; //
		protected int recompensa;//por matarlo en monedas o dolar se suma al dinero del jugador
		protected int da�o;//No ataca a la ciudad ,sino que es el da�o  al llegar a la base.
		protected Objeto premio; // No todos los enemigos dan premios
		protected Pair[] camino;
		protected Pair pos;
		protected int k;
		Enemigo(int vida,int recompensa,int da�o,Pair[] cam){
		 super(vida);
		 this.recompensa=recompensa;
		 this.da�o=da�o;
		 camino=cam;
		 k=0;
		 pos=camino[k];
				}
		public Enemigo(int vida,int recompensa,int da�o,Objeto p,Pair[] p2){
			 super(vida);
			 this.recompensa=recompensa;
			 this.da�o=da�o;
			 premio =p;
			 camino=p2;
			 k=0;
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
		public int getX(){
			return pos.getX();
		}
		
		public int getY(){
			return pos.getY();
		}
		
		public void mover(){
			k++;
			pos=camino[k];
		}
	}
