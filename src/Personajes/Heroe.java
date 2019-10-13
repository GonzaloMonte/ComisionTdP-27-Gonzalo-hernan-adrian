package Personajes;

import Visitor.Visitor;
import Main.Mapa;
import Main.Mapa.*;

public class Heroe extends Entidad{
		int x,y;
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

		public void accept(Visitor v) {
			// TODO Auto-generated method stub
			
		}
		public void atacar()  {
			for(int i=x-alcance;i<x+alcance && (i>=0 && i<=31);i++) {
				for(int j=y-alcance;j<y+alcance && (j>=0 && j<=31);j++) {
					Entidad en=Mapa.celdas[i][j].obtenerEntidad();
					System.out.println("Hay Enemigps");
				}				
			}
			
		}
				
		public void setX(int x){
			this.x=x;
		}
		
		public void setY(int y){
			this.y=y;
		}
		
		public int getX(){
			return x;
		}
		
		public int getY(){
			return y;
		}
	}