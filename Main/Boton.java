package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Personajes.Entidad;

public class Boton extends JButton {
	
	private static final long serialVersionUID = 1L;
	protected Entidad entidad;
	
	public Boton(Entidad e,Ventana v) {
		entidad=e;
		OyenteBoton oyenteB=new OyenteBoton(entidad,v);
		this.addActionListener(oyenteB);
	}
	public void setEntidad(Entidad e) {
		entidad=e;
	}
	public Entidad getEntidad() {
		return entidad;
	}
}
class OyenteBoton implements ActionListener{
	protected Entidad entidad;	
	protected Ventana ventana;
	public OyenteBoton(Entidad e,Ventana v) {
			entidad=e;
			ventana=v;
		}
		public void actionPerformed(ActionEvent e) {
			ventana.setHeroe(entidad);
	
	}
}