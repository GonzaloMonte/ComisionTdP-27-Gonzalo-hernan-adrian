package Personajes;
import Objetos.*;
import Visitor.Visitor;
import Visitor.VisitorEnemigo;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Main.*;
	
	public class Enemigo extends Entidad{
		protected int velocidad; //
		protected int recompensa;//por matarlo en monedas o dolar se suma al dinero del jugador
		protected Objeto premio; // No todos los enemigos dan premios
		protected int tiempo;
		protected int da�o;
		protected int alcance;
		protected boolean congelado;
		//para congelar
		protected int tiempoCongelado;
		protected int contador;
		
		public Enemigo(int vida,int recompensa,int arranque){
			super(vida);
			this.recompensa=recompensa;
			visitor=new VisitorEnemigo();
			tiempo=velocidad;
			x=arranque;
			y=0;
			icono=new JLabel();
			congelado=false;
		}
		public Enemigo(int vida,int recompensa,Objeto p){
			 super(vida);
			 this.recompensa=recompensa;
			 premio =p;
			 visitor=new VisitorEnemigo();
			 tiempo=velocidad;
			 icono=new JLabel();
			 contador=0;
			 tiempoCongelado=10;
			}
		
		public int getVelocidad(){
			return velocidad;
		}
		
		public int getRecompensa(){
			return recompensa;
		}
		
		/**
		 * 
		 * 
		 * @param a es el valor de daño del heroe que lo ataco
		 */
		

		
		public void mover(){
			
			if (tiempo==0) {
				if (y==yMax-2) {
					Mapa.mapa.da�oBase(da�o);
					destruir();

					
				}
				else {
				if(y+1<yMax  && !Mapa.celdas[x][y+1].ocupada() ) {
					Mapa.celdas[x][y].liberarCelda();
					y=y+1;
				}
				else if (x+1<xMax  &&  !Mapa.celdas[x+1][y].ocupada()) {
						Mapa.celdas[x][y].liberarCelda();	
						x=x+1;
					}
					else if ( x-1>0  && !Mapa.celdas[x-1][y].ocupada()) {
						Mapa.celdas[x][y].liberarCelda();	
						x=x-1;
					}
				
				Mapa.celdas[x][y].agregarPersonaje(this);
				tiempo=velocidad;
				}
			}
			else tiempo=tiempo-10;

		}
		public void setVida(int i) {
			vida=i;
		}
		
		public void accept(Visitor v) {
			v.visitEnemigo(this);
			
		}

		public void actualizar() {
			if(congelado) {
				contador++;
			}
			else {
				mover();
				atacar();
			}
			if (contador==this.tiempoCongelado) 
				congelado=false;
		}
	
		public Visitor getVisitor() {
			
			return visitor;
		}

		public JLabel getLabel() {
			return icono;
		}
		public void atacado(int a){
			vida=vida-a;
			if(vida<=0) {
				Mapa.mapa.setDinero(recompensa);
				Mapa.mapa.setScore(1);
				destruir();

			}
		}
		public void crearDisparo() {
			Entidad e=new DisparoEnemigo(this,alcance);
			Mapa.mapa.agregarEntidad(e);
		}
		public void atacar() {}
		public void destruir() {
			Mapa.mapa.eliminarEntidad(this);
			if (premio!=null) {


				premio.SetPosicion(x,y);
				Mapa.mapa.agregarEntidad(premio);
			}

			Mapa.mapa.mori();

		}
		public void congelar() {
			congelado=true;
		}
	}
	
