package Personajes;

import Visitor.Visitor;
import Visitor.VisitorHeroes;

import javax.swing.JLabel;

import Main.Mapa;
import Main.Mapa.*;
import Main.Pair;

public class Heroe extends Entidad{
		int x,y;
		protected int daño;
		protected int alcance;
		protected int precio;
		protected int velocidad,tiempo;
		protected boolean escudo=false;
		protected JLabel sprintEscudo;
		
		public Heroe(int vida,int d,int a){
		 super(vida);
		 daño=d;
		 alcance=a;
		 visitor=new VisitorHeroes();
		 sprintEscudo=new JLabel();
		}

		
		public int getAlcance(){
			return alcance;	
		}

		void Mejorar(){
			daño=daño+((40*daño)/100);
			
		}

		public void accept(Visitor v) {
			v.visitAliado(this);			
		}
		public void atacar()  {
		if (tiempo==0) {
			int alcanceX=x-alcance;
			int MalcanceX=x+alcance;
			int alcanceY=y-alcance;
			int MalcanceY=y+alcance;
			if (alcanceX<0) alcanceX=0;
			if (alcanceY<0) alcanceY=0;
			if (MalcanceY>yMax) MalcanceY=yMax;
			if (MalcanceX>xMax) MalcanceX=xMax;
			for(int i=alcanceX;i<MalcanceX && tiempo==0 ;i++) {
				for(int j=alcanceY;j<MalcanceY && tiempo==0;j++) {
					if(Mapa.celdas[i][j].ocupada()) {
					Entidad en=Mapa.celdas[i][j].obtenerEntidad();
						if(en!=null) {
							Visitor v=en.getVisitor();
							v.visitAliado(this);
							tiempo=velocidad;
						}
					}
				}	
			}
		}
		else tiempo=tiempo-10;
		}
		public void crearDisparo() {
				if (!Mapa.celdas[x][y-1].ocupada()) {
				Entidad e=new Disparo(this,x,y-1,alcance);
				Mapa.mapa.agregarEntidad(e);
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
		public JLabel getLabel() {
			if (escudo) {
				return sprintEscudo;
			}
			else
			return icono;
		}
		public int getPrecio() {
			return precio;
		}
		public Entidad clonar() {
			return this;
		}
		public void atacado(int a) {
			if (escudo) {
				escudo=false;
			}
			else {
				vida=vida-a;
				if(vida<=0) {
					destruir();
				}
			}
		}
		public void activarEscudo() {
			escudo=true;
		}
	}