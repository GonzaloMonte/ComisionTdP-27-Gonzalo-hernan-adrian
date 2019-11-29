package Personajes;

import Objetos.*;

import javax.swing.ImageIcon;



public class Thanos extends Enemigo{
	public Thanos(Objeto Premio){	
		super(1500,90,Premio);
		da�o=80;
		velocidad=40;
		tiempo=10;
		icono.setIcon(new ImageIcon("img\\Thanos.gif"));
		iconoEscudo.setIcon(new ImageIcon("img\\ThanosEscudo.gif"));
	}
	public Thanos(int x){
		super(1500,90,x);
		da�o=80;
		velocidad=40;
		tiempo=10;
		icono.setIcon(new ImageIcon("img\\Thanos.gif"));
		iconoEscudo.setIcon(new ImageIcon("img\\ThanosEscudo.gif"));
	}
}
