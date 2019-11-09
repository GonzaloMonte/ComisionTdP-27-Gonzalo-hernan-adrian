package Main;

import java.util.Random;
import Objetos.*;

public class PrimeraOleada<Ventada> extends Thread {
	protected Ventana ventana;
	protected Mapa mapa;
	protected int maximoEnemigosT=4;
	protected int maximoEnemigosR=4;
	protected int cantidadEnemigos;
	private int segundos=0;
	public PrimeraOleada(Mapa m,Ventana v){
		mapa=m;
		ventana=v;
		cantidadEnemigos=this.maximoEnemigosR+this.maximoEnemigosT;
	}
	public void run(){
		int k=0;
		boolean juego=true;
		while(juego){

			try {
				Thread.sleep(1000);
				if (k<maximoEnemigosT)
					mapa.crearEnemigoTanque();
				if (k<maximoEnemigosR)
					mapa.crearEnemigoRobot();
					
			
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			k++;
			mapa.ActualizarMapa();
			ventana.armarEscenario();
			if (mapa.getBase()<=0) {
				juego=false;
				ventana.perder();
			}
			if (cantidadEnemigos==mapa.getMuertos()) {
				juego=false;
				SegundaOleada<Ventana> lilo=new SegundaOleada<Ventana>(mapa,ventana);
				lilo.start();
			}
			segundos++;
			if(segundos==10){
			Random r=new Random();
			
			Random q=new Random();
			
			int x=r.nextInt(18); int y=r.nextInt(18);
			int z=q.nextInt(2);
			if(!mapa.celdas[x][y].ocupada())
				if(z==0)
					mapa.celdas[x][y].agregarPersonaje(new Piedra());
				else{
					objetoConTiempo lilo=new objetoConTiempo(mapa.celdas[x][y]);
					lilo.start();
				}
					
			segundos=0;
			}
			
				
		}	
	}
}