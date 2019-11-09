package Personajes;

import javax.swing.*;

import Main.Celda;

public class LiloExplosion extends Thread{
	Celda icono;
	public LiloExplosion(Celda celdas){
		this.icono=celdas;
	}
	public void run(){
		
		icono.getLabel().setIcon(new ImageIcon("img\\explosion.gif"));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		icono.getLabel().setIcon(new ImageIcon("img\\celdaAliada.jpg"));

	}
	
}
