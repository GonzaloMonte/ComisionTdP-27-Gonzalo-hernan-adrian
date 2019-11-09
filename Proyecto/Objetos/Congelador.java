package Objetos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Visitor.Visitor;
import Visitor.VisitorCongelar;

public class Congelador extends ObjetoConTiempo{
	protected int contador=0;
	public Congelador(int vida) {
		super(vida);
		tiempo=20;
		visitor=new VisitorCongelar();
		icono=new JLabel();
		icono.setIcon(new ImageIcon("img\\congelar.jpg"));
	}


	public void accept(Visitor v) {
		v.VisitCongelar(this);
		
	}


	public void actualizar() {
		contador++;
		if (contador==tiempo) {
			this.destruir();
		}
		
	}

	public Visitor getVisitor() {
		
		return null;
	}

	
	public JLabel getLabel() {
	
		return icono;
	}

}
