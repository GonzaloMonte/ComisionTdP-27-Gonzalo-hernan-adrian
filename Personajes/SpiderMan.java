package Personajes;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Main.Mapa;

public class SpiderMan extends Heroe{
	public SpiderMan(){ 
		super(100,25,6);
		icono=new JLabel();
		icono.setIcon(new ImageIcon("img\\SpiderMan.gif"));
		precio=10;
		daño=5;
		velocidad=10;
		sprintEscudo.setIcon(new ImageIcon("img\\SpiderMan_proteccion.jpg"));
	}
	public Entidad clonar() {
		return new SpiderMan();
	}
	public void crearDisparo() {
		if (!Mapa.celdas[x][y-1].ocupada()) {
			Entidad e=new DisparoSpiderMan(this,x,y-1,alcance);
			Mapa.mapa.agregarEntidad(e);
			}
		
	}

}
