package Personajes;

import javax.swing.ImageIcon;

import Main.Pair;
import Objetos.*;

public class Robot extends Enemigo{
	
	public Robot(int x,Objeto Premio){	
		super(100,30,Premio);
		this.x=x;
		icono.setIcon(new ImageIcon("img\\RobotEnemigo.gif"));
		daño=50;
		velocidad=10;
		tiempo=velocidad;
		alcance=8;
	}
	public Robot(int x){
		super(100,30,x);
		icono.setIcon(new ImageIcon("img\\RobotEnemigo.gif"));
		daño=50;
		velocidad=10;
		tiempo=velocidad;
		alcance=8;
	}
}
