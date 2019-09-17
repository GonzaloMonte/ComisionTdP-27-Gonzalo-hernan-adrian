package Main;

import Personajes.*;
public class ContadorTiempo extends Thread {
	protected Ventana ventana;
	protected Mapa mapa;
	
	ContadorTiempo(Ventana v,Mapa m){
		ventana=v;
		mapa=m;
	}
	public void run(){
		Enemigo e1=ventana.empezarOleada();
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			ventana.limpiarCelda(e1.getX(),e1.getY());
			e1.mover();
			ventana.colocarEnemigo(e1);
		}	
	}	
}