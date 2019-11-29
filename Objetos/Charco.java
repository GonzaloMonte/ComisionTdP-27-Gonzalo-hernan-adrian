package Objetos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Visitor.Visitor;
import Visitor.VisitorNull;

public class Charco extends ObjetoConTiempo{

	public Charco(int vida) {
		super(vida);
		icono=new JLabel();
		 icono.setIcon((new ImageIcon("img\\charco.jpg")));
		 visitor=new VisitorNull();
	}
	public void atacado(int i){
		
	} 

	public void accept(Visitor v) {
		
		
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
