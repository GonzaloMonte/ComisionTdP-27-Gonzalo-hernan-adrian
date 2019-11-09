package Objetos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Visitor.Visitor;

public class Piedra extends ObjetoConVida{

public Piedra(){
	 super(100);
	 icono=new JLabel();
	 icono.setIcon((new ImageIcon("img\\piedra.png")));
 }

public void accept(Visitor v) {
	v.VisitPiedra(this);
	
}

public void actualizar() {
	
	
}
public void atacado(int d){
	vida=vida-d;
	if(vida<=0)
		this.destruir();
}


public Visitor getVisitor() {
	return null;
}


public JLabel getLabel() {
	
	return icono;
}	
}
