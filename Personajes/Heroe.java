package Personajes;

import Visitor.Visitor;
import Visitor.VisitorHeroes;
import Main.Mapa;
import Main.Mapa.*;

public class Heroe extends Entidad{
		int x,y;
		protected int da�o;
		protected boolean aereo=false;
		protected int alcance;
		
		
		public Heroe(int vida,int d,int a){
		 super(vida);
		 da�o=d;
		 alcance=a;
		 visitor=new VisitorHeroes();
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

		public void accept(Visitor v) {
			// TODO Auto-generated method stub
			
		}
		public void atacar()  {
			for(int i=x-alcance;i<x+alcance && (i>=0 && i<=31);i++) {
				for(int j=y-alcance;j<y+alcance && (j>=0 && j<=31);j++) {
					Entidad en=Mapa.celdas[i][j].obtenerEntidad();
					if(en!=null) {
					Visitor v=en.getVisitor();
					v.visitAliado(this);
					}
				}	
			}
		}
		public void crearDisparo() {
			Disparo d=new Disparo(this,2);
			if (Mapa.celdas[x][y+1].queSoy()=="celdaEnemiga") {
				Mapa.celdas[x][y+1].agregarPersonaje(d);
			}
			else
				if (Mapa.celdas[x][y-1].queSoy()=="celdaEnemiga") {
					Mapa.celdas[x][y-1].agregarPersonaje(d);
				}
				else
					if (Mapa.celdas[x-1][y].queSoy()=="celdaEnemiga") {
						Mapa.celdas[x-1][y].agregarPersonaje(d);
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
	
		public void actualizar() {
			atacar();
			
		}
		
		public Visitor getVisitor() {
			
			return visitor;
		}
	}