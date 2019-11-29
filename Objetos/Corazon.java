package Objetos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Visitor.Visitor;
import Visitor.VisitorNull;

public class Corazon extends ObjetoConVida {

	public Corazon(int v) {
		super(v);
		icono=new JLabel();
		icono.setIcon(new ImageIcon("img\\corazon.jpg"));
		visitor=new VisitorNull();
	}


	public void accept(Visitor v) {
		v.VisitCorazon(this);
		
	}


	public void actualizar() {
		
		
	}

	
	public Visitor getVisitor() {
		
		return visitor;
	}

	public JLabel getLabel() {
		
		return icono;
	}
	
}
