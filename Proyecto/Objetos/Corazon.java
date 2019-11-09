package Objetos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Visitor.Visitor;

public class Corazon extends ObjetoConVida {

	public Corazon(int v) {
		super(v);
		icono=new JLabel();
		icono.setIcon(new ImageIcon("img\\corazon.jpg"));
	}


	public void accept(Visitor v) {
		v.VisitCorazon(this);
		
	}


	public void actualizar() {
		
		
	}

	
	public Visitor getVisitor() {
		
		return null;
	}

	public JLabel getLabel() {
		
		return icono;
	}
	
}
