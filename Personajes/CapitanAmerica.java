package Personajes;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Main.Mapa;

public class CapitanAmerica extends Heroe{
		
		public CapitanAmerica(){ 
			super(100,50,10);
			icono=new JLabel();
			icono.setIcon(new ImageIcon("img\\CapitanAmerica_Ataque.gif"));
			precio=30;
			daño=100;
			velocidad=50;
			sprintEscudo.setIcon(new ImageIcon("img\\CapitanAmerica_proteccion.jpg"));
		}
		public Entidad clonar() {
			return new CapitanAmerica();
		}
		public void crearDisparo() {
			if (!Mapa.celdas[x][y-1].ocupada()) {
				Entidad e=new DisparoCapitanAmerica(this,x,y-1,alcance);
				Mapa.mapa.agregarEntidad(e);
				}
			
		}
	}
