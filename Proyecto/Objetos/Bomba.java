package Objetos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Main.Mapa;
import Personajes.Entidad;
import Personajes.LiloExplosion;
import Visitor.Visitor;
import Visitor.VisitorBomba;

public class Bomba extends ObjetoConVida{
	protected int daño=100;
	protected int alcance=3;
	protected boolean activada; 
	public Bomba(int v,int xn,int yn,boolean estado) {
		super(v);
		activada=estado;
		x=xn;
		y=yn;
		icono=new JLabel();
		icono.setIcon(new ImageIcon("img\\bomba.png"));
		visitor=new VisitorBomba();
	}


	public void accept(Visitor v) {
				v.VisitBomba(this);
	}


	public void actualizar() {
		if (activada)
			explotar();
		
	}

	public Visitor getVisitor() {
		return visitor;
	}


	public JLabel getLabel() {
		return icono;
	}
	
	private void explotar() {
		int alcanceX=x-alcance;
		int MalcanceX=x+alcance;
		int alcanceY=y-alcance;
		int MalcanceY=y+alcance;
		if (alcanceX<0) alcanceX=0;
		if (alcanceY<0) alcanceY=0;
		if (MalcanceY>yMax) MalcanceY=yMax;
		if (MalcanceX>xMax) MalcanceX=xMax;
		for(int i=alcanceX;i<MalcanceX;i++) {
			for(int j=alcanceY;j<MalcanceY;j++) {
				if(Mapa.celdas[i][j].ocupada()) {
				Entidad en=Mapa.celdas[i][j].obtenerEntidad();
					if(en!=null) {
						en.atacado(daño);
					}
				}
			}
		}
		LiloExplosion lilo=new LiloExplosion(Mapa.celdas[x][y]);
		lilo.start();
		this.destruir();
	}
	public void activarBomba() {
		activada=true;
	}
}