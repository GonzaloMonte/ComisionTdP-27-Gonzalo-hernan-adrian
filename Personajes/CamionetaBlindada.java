package Personajes;

import javax.swing.ImageIcon;

import Objetos.Objeto;


public class CamionetaBlindada extends Enemigo{
	public CamionetaBlindada(int x,Objeto Premio){		
		super(1000,30,Premio);
		
		icono.setIcon(new ImageIcon("img\\camionetaBlindada.jpg"));
		iconoEscudo.setIcon(new ImageIcon("img\\camionetaBlindadaEscudo.jpg"));
		this.x=x;
		daño=10;
		velocidad=30;
		tiempo=velocidad;
		alcance=8;
	}
	public CamionetaBlindada(int x){
		super(1000,30,x);
		this.x=x;
		icono.setIcon(new ImageIcon("img\\camionetaBlindada.jpg"));
		iconoEscudo.setIcon(new ImageIcon("img\\camionetaBlindadaEscudo.jpg"));
		daño=10;
		velocidad=30;
		tiempo=velocidad;
		alcance=8;
	}
}
