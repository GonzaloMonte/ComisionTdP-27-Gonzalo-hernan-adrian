package Personajes;
import Objetos.*;
import Visitor.Visitor;
import Visitor.VisitorEnemigo;
import Main.*;
	
	public class Enemigo extends Entidad{
		protected int velocidad; //
		protected int recompensa;//por matarlo en monedas o dolar se suma al dinero del jugador
		protected int dato;//No ataca a la ciudad ,sino que es el daño  al llegar a la base.
		protected Objeto premio; // No todos los enemigos dan premios
		protected Pair[] camino;
		protected int k;

		
		public Enemigo(int vida,int recompensa,int dato,Pair[] cam){
			super(vida);
			this.recompensa=recompensa;
			this.dato=dato;
			camino=cam;
			k=0;
			x=camino[k].getX();
			y=camino[k].getY();
			visitor=new VisitorEnemigo();
		}
		public Enemigo(int vida,int recompensa,int dato,Objeto p,Pair[] p2){
			 super(vida);
			 this.recompensa=recompensa;
			 this.dato=dato;
			 premio =p;
			 camino=p2;
			 k=0;
			 x=camino[k].getX();
			 y=camino[k].getY();
			 visitor=new VisitorEnemigo();

			}
		
		public int getVelocidad(){
			return velocidad;
		}
		
		public int getRecompensa(){
			return recompensa;
		}
		
		public int getDato(){
			return dato;
		}
		/**
		 * 
		 * 
		 * @param a es el valor de daño del heroe que lo ataco
		 */
		public void atacado(int a){
			vida=vida-a;
		}
	
		
		public boolean llego(){
			return k==(camino.length-1);
		} 
		
	
		
		public void mover(){
			if(k<camino.length-1){
				k++;
				x=camino[k].getX();
				y=camino[k].getY();
			}
			Mapa.celdas[x][y].agregarPersonaje(this);
		}
		public void setVida(int i) {
			vida=i;
		}
		
		public void accept(Visitor v) {
			
			
		}

		public void actualizar() {
			Mapa.celdas[x][y].liberarCelda();
			mover();
			
		}
	
		public Visitor getVisitor() {
			
			return visitor;
		}
		
	}
