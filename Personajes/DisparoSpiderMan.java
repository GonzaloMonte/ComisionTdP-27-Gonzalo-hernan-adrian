package Personajes;

import javax.swing.ImageIcon;

public class DisparoSpiderMan extends Disparo{

	public DisparoSpiderMan(Heroe h, int x, int y, int alcance) {
		super(h, x, y, alcance);
		if(h.getY()>y)
			 icono.setIcon(new ImageIcon("img\\HombreAra�a_Telera�a.jpg"));
			da�o=50;
		}
	
}
