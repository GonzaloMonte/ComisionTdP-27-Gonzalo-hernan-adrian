package Personajes;

import javax.swing.JLabel;

import Main.Mapa;
import Visitor.*;

public abstract class Entidad {
		protected int vida;
		protected Visitor visitor;
		protected int x;
		protected int y;
		protected JLabel icono;
		protected int xMax=20;
		protected int yMax=20;

		public Entidad(int vida){
			this.vida=vida;
		}
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
		public int getVida(){	 
			return vida;
	    }
		
		public abstract void accept(Visitor v);

		public abstract void actualizar();
		
		public abstract Visitor getVisitor();
		
		public abstract JLabel getLabel();
		//{}
		public void destruir() {
			Mapa.mapa.eliminarEntidad(this);

		}

		public void atacado(int a){
			vida=vida-a;
			if(vida<=0) {
				destruir();
			}
		}
}
