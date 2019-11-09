package Objetos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Visitor.Visitor;
import Visitor.VisitorEscudo;

public class Escudo extends ObjetoConTiempo {
	protected int contador;
	public Escudo(int vida) {
		super(vida);
		icono=new JLabel();
		icono.setIcon(new ImageIcon("img\\escudo.jpg"));
		visitor=new VisitorEscudo();
		tiempo=20;
		contador=0;
	}


	public void accept(Visitor v) {
		v.VisitEscudo(this);
		
	}


	public void actualizar() {
		contador++;
		if (contador==tiempo) {
			this.destruir();
		}
		
	}

	public Visitor getVisitor() {
	
		return visitor;
	}


	public JLabel getLabel() {
		
		return icono;
	}
	
}
