package Personajes;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Main.Mapa;

public class Thor extends Heroe{
		public Thor(){ 
			super(100,100,10);
			icono=new JLabel();
			icono.setIcon(new ImageIcon("img\\Thor_ataque.gif"));
			precio=20;
			daño=40;
			velocidad=30;
			alcance=5;
			sprintEscudo.setIcon(new ImageIcon("img\\Thor_proteccion.jpg"));
		}
		public Entidad clonar() {
			return new Thor();
		}
		public void crearDisparo() {
			if(y>0)
			if (!Mapa.celdas[x][y-1].ocupada()) {
			Entidad e=new DisparoThor(this,x,y-1,alcance);
			Mapa.mapa.agregarEntidad(e);
			}
			if(x>0)
			if (!Mapa.celdas[x-1][y].ocupada()) {
				Entidad e=new DisparoThor(this,x-1,y,alcance);
				Mapa.mapa.agregarEntidad(e);
				}
			if(x+1<xMax)
			if (!Mapa.celdas[x+1][y].ocupada()) {
				Entidad e=new DisparoThor(this,x+1,y,alcance);
				Mapa.mapa.agregarEntidad(e);
				}
		}
	}
