package Objetos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Main.Mapa;
import Visitor.Visitor;
import Visitor.VisitorNull;

public class Piedra extends ObjetoConVida{

public Piedra(){
	 super(100);
	 icono=new JLabel();
	 icono.setIcon((new ImageIcon("img\\piedra.png")));
	 visitor=new VisitorNull();
 }

public void accept(Visitor v) {
	v.VisitPiedra(this);
	
}

public void actualizar() {
	
	
}
public void atacado(int d){
	vida=vida-d;
	if(vida<=0) {
	
		destruir();
	}
}


public Visitor getVisitor() {
	return visitor;
}


public JLabel getLabel() {
	
	return icono;
}
public void destruir() {
	Mapa.celdas[x][y].liberarCelda();
}
}
