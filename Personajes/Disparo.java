package Personajes;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Main.*;
import Visitor.Visitor;
import Visitor.VisitorDisparo;

 public class Disparo extends Entidad{
	 protected int alcance;
	 protected Entidad heroe;
	 protected int daño;
	 public Disparo(Heroe h,int x,int y,int alcance){
		 super(100);
		 this.alcance=alcance;
		 heroe=h;
		 this.x=x;
		 this.y=y;
		 visitor=new VisitorDisparo(this);
		 icono=new JLabel();
		 icono.setIcon(new ImageIcon("img\\disparo.jpg"));
		 daño=300;
	 }

	
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}


	public void actualizar() {
			mover();
	}

	public void mover() {
		int xv=x;
		int yv=y;
		int xn=x;
		int yn=y;
		if (heroe.getX()>x) {xn=x-1;yn=y;}
		else if (heroe.getX()<x){xn=x+1;yn=y;}
				else if (heroe.getY()>y){xn=x;yn=y-1;}
		
		if(yn<0 || xn<0 || xn==xMax || yn==yMax) {
			destruir();
		}
		else
			if(Mapa.celdas[xn][yn].ocupada() && (xn!=x || yn!=y)) {
				Mapa.celdas[xn][yn].obtenerEntidad().accept(visitor);
				destruir();
			}
			else if (!Mapa.celdas[xn][yn].ocupada()) {	
					y=yn;
					x=xn;
					Mapa.celdas[xv][yv].liberarCelda();
					Mapa.celdas[xn][yn].agregarPersonaje(this);
					
			}
		}
		
		
	public Visitor getVisitor() {
		return visitor;
	}

	public JLabel getLabel() {
		return icono;
	}
	public int getDaño() {
		return daño;
	}


 }
