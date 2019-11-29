package Personajes;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Main.Mapa;
import Visitor.Visitor;

import Visitor.VisitorDisparoEne;

public class DisparoEnemigo extends Entidad {
	protected int daño;
	 public DisparoEnemigo(Enemigo h,int alcance){
		 super(100);
		 x=h.getX();
		 y=h.getY()+1;
		 icono=new JLabel();
		 icono.setIcon(new ImageIcon("img\\disparoTanque.jpg"));
		 daño=50;
		 visitor=new VisitorDisparoEne(daño);
	 }

	



	@Override
	public void actualizar() {
		mover();
	}

	public Visitor getVisitor() {

		return visitor;
	}

	public JLabel getLabel() {
		return icono;
	}


	public void accept(Visitor v) {
		v.visitDisparoEne(this);
		
	}
	public void mover() {
		int xv=x;
		int yv=y;
		if(y==yMax-1) {
			Mapa.mapa.dañoBase(10);
			destruir();
		}
		else
			if(Mapa.celdas[x][y+1].ocupada()) {
				Mapa.celdas[x][y+1].obtenerEntidad().accept(visitor);
				destruir();
			}
			else if (!Mapa.celdas[x][y+1].ocupada()) {	
					y=y+1;
					Mapa.celdas[xv][yv].liberarCelda();
					Mapa.celdas[x][y].agregarPersonaje(this);
					
			}
		}
	public int getDaño() {
		return daño;
	}
}
