package Personajes;

import javax.swing.ImageIcon;

public class DisparoThor extends Disparo {

	public DisparoThor(Heroe h, int x, int y, int alcance) {
		super(h, x, y, alcance);
		if (heroe.getX()>x) icono.setIcon(new ImageIcon("img\\rayoabajo.jpg"));
		else if (heroe.getX()<x) icono.setIcon(new ImageIcon("img\\rayoarriba.jpg"));
				else if (heroe.getY()>y) icono.setIcon(new ImageIcon("img\\rayoiz.jpg"));
		daño=100;
	}

}
