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
		ventana.empezarOleada();
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (!(mapa.listaEnemigosVivos().isEmpty()))
			for (Enemigo e: mapa.listaEnemigosVivos()) {
			
			ventana.limpiarCelda(e.getX(),e.getY());
			e.mover();
			ventana.colocarEnemigo(e);
			
			}
		}	
	}	
}