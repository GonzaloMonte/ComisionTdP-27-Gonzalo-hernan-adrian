package Personajes;

import Main.*;
import Visitor.Visitor;
import Visitor.VisitorDisparo;

 public class Disparo extends Entidad{
	 protected int alcance;
	 protected Pair pos;
 
	 public Disparo(Heroe h,int alcance){
		 super(100);
		 pos=new Pair(h.getX(),h.getY());
		 visitor=new VisitorDisparo();
	 }

	
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}


	public void actualizar() {
			
	}


	
	public Visitor getVisitor() {
		
		return visitor;
	}
 }
