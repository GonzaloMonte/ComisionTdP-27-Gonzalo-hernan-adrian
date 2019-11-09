package Personajes;

import javax.swing.ImageIcon;

public class DisparoCapitanAmerica extends Disparo{

	public DisparoCapitanAmerica(Heroe h, int x, int y, int alcance) {
		super(h, x, y, alcance);
		if(h.getY()>y)
		  icono.setIcon(new ImageIcon("img\\CapitanAmerica_Escudo.gif"));
		daño=50;
	}

}
