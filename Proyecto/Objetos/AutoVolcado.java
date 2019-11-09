package Objetos;

import javax.swing.JLabel;

import Visitor.Visitor;

public class AutoVolcado extends ObjetoConVida{

 AutoVolcado(){
	 super(200);
 }

public void accept(Visitor v) {
	// TODO Auto-generated method stub
	
}

public void actualizar() {
	// TODO Auto-generated method stub
	
}


public Visitor getVisitor() {
	return null;
}

@Override
public JLabel getLabel() {
	// TODO Auto-generated method stub
	return null;
}	
}
