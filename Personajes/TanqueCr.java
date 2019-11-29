package Personajes;

import javax.swing.ImageIcon;


import Main.Mapa;

import Objetos.*;


public class TanqueCr extends Enemigo{
	
	protected int tiempoA;
	protected int alcance;
	public TanqueCr(int x){
		super(200,90,x);
		icono.setIcon(new ImageIcon("img\\TanqueCr_H.jpg"));
		iconoEscudo.setIcon(new ImageIcon("img\\TanqueCr_H_Escudo.jpg"));
		daño=50;
		velocidad=10;
		tiempoA=velocidad;
		alcance=8;
		
	}
	public TanqueCr(int x,Objeto o){
		super(200,90,o);
		this.x=x;
		icono.setIcon(new ImageIcon("img\\TanqueCr_H.jpg"));
		iconoEscudo.setIcon(new ImageIcon("img\\TanqueCr_H_Escudo.jpg"));
		
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
