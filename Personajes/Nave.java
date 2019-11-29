package Personajes;


import javax.swing.ImageIcon;

import Objetos.*;

public class Nave extends Enemigo{
	public Nave(int x,Objeto Premio){	
		super(4000,30,Premio);
		icono.setIcon(new ImageIcon("img\\nave.jpg"));
		iconoEscudo.setIcon(new ImageIcon("img\\naveEscudo.jpg"));
		this.x=x;
		daño=0;
		velocidad=10;
		tiempo=velocidad;
		alcance=8;
	}
	public Nave(int x){
		super(4000,30,x);
		icono.setIcon(new ImageIcon("img\\nave.jpg"));
		iconoEscudo.setIcon(new ImageIcon("img\\naveEscudo.jpg"));
		this.x=x;
		daño=0;
		velocidad=10;
		tiempo=velocidad;
		alcance=8;
	}
}
