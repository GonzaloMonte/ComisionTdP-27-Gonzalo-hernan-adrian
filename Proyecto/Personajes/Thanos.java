package Personajes;

import Objetos.*;

import javax.swing.ImageIcon;

import Main.Pair;

public class Thanos extends Enemigo{
	public Thanos(Objeto Premio){	
		super(1500,90,Premio);
	}
	public Thanos(int x){
		super(1500,90,x);
		daño=80;
		velocidad=10;
		tiempo=10;
		icono.setIcon(new ImageIcon("img\\Thanos.gif"));
	}
}
