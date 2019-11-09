package Personajes;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Main.Mapa;
import Visitor.VisitorHulk;

public class Hulk extends Heroe{
		
		public Hulk(){ 
			super(100,50,1);
			visitor=new VisitorHulk(daño);
			icono=new JLabel();
			icono.setIcon(new ImageIcon("img\\Hulk.gif"));
			precio=50;
			velocidad=30;
			sprintEscudo.setIcon(new ImageIcon("img\\Hulk_proteccion.jpg"));
		}
		public void atacar() {
			if(x-1>=0) {
				if(Mapa.celdas[x-1][y].ocupada()) {
					Mapa.celdas[x-1][y].obtenerEntidad().accept(visitor);
				}
			}
			if(x+1<xMax) {
				if(Mapa.celdas[x+1][y].ocupada()) {
					Mapa.celdas[x+1][y].obtenerEntidad().accept(visitor);
				}
			}
			if(y+1<yMax) {
				if(Mapa.celdas[x][y+1].ocupada()) {
					Mapa.celdas[x][y+1].obtenerEntidad().accept(visitor);
				}
			}
			if(y-1>=0) {
				if(Mapa.celdas[x][y-1].ocupada()) {
					Mapa.celdas[x][y-1].obtenerEntidad().accept(visitor);
				}
			}
		}
		public Entidad clonar() {
			return new Hulk();
		}
	}
