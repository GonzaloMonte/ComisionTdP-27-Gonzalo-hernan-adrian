package Personajes;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Main.Mapa;
import Visitor.Visitor;

import Visitor.VisitorDisparoEne;

public class DisparoEnemigo extends Entidad {
	protected int da�o;
	 public DisparoEnemigo(Enemigo h,int alcance){
		 super(100);
		 x=h.getX();
		 y=h.getY()+1;
		 icono=new JLabel();
		 icono.setIcon(new ImageIcon("img\\disparoTanque.jpg"));
		 da�o=50;
		 visitor=new VisitorDisparoEne(da�o);
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
			Mapa.mapa.da�oBase(10);
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
	public int getDa�o() {
		return da�o;
	}
}
