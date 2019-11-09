package Personajes;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class IronMan extends Heroe{
		
		public IronMan(){ 
			super(100,100,4);
			icono=new JLabel();
			icono.setIcon(new ImageIcon("img\\IronMan_Ataque.gif"));
			precio=10;
			daño=10;
			velocidad=30;
			sprintEscudo.setIcon(new ImageIcon("img\\IronMan_proteccion.jpg"));
		}
		public Entidad clonar() {
			return new IronMan();
		}
		
	} 
