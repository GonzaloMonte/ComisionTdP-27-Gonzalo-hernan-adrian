package Personajes;
import Objetos.*;

import javax.swing.ImageIcon;

import Main.Mapa;
import Main.Pair;

public class TanqueCm extends Enemigo{
	protected int tiempoA;
	protected int alcance;
		public TanqueCm(int x,Objeto Premio){	
			super(500,10,Premio);
			this.x=x;
			icono.setIcon(new ImageIcon("img\\TanqueCm.jpg"));
			
			daño=40;
			velocidad=10;
			tiempo=10;
			
		}
		public TanqueCm(int x){
			super(500,10,x);
			daño=40;
			velocidad=10;
			tiempo=10;
			icono.setIcon(new ImageIcon("img\\TanqueCm.jpg"));
		}
		public void atacar() {
			if (tiempoA==0) {
				int alcanceY=y+alcance;
				if (alcanceY>=yMax) alcanceY=yMax-1;
				for(int i=y+1;i<alcanceY && tiempoA==0 ;i++) {
						if(Mapa.celdas[x][i].ocupada()) {
						Entidad en=Mapa.celdas[x][i].obtenerEntidad();
							if(en!=null) {
								en.getVisitor().visitEnemigo(this);
								tiempoA=velocidad;
								tiempo=velocidad;
							}
						}
					}	
			}
			else tiempoA=tiempoA-10;
			}
		
	}