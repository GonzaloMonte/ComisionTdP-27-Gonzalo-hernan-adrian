package Main;

import Objetos.Charco;

public class objetoConTiempo extends Thread{
	Celda c;
	public objetoConTiempo(Celda celda) {
		c=celda;
	}
	public void run(){
		c.agregarPersonaje(new Charco(100));
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c.liberarCelda();
	}
}
