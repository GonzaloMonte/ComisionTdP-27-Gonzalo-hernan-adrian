package Objetos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Visitor.Visitor;

public class Charco extends ObjetoConTiempo{

	public Charco(int vida) {
		super(vida);
		icono=new JLabel();
		 icono.setIcon((new ImageIcon("img\\charco.jpg")));
	}
	public void atacado(int i){
		
	} 
	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Visitor getVisitor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JLabel getLabel() {
		// TODO Auto-generated method stub
		return icono;
	}

}
