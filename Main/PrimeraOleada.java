package Main;

import java.util.Random;
import Objetos.*;
import Personajes.CamionetaBlindada;
import Personajes.Entidad;
import Personajes.Robot;
import Personajes.TanqueCr;

public class PrimeraOleada<Ventada> extends Thread {
	protected Ventana ventana;
	protected Mapa mapa;
	protected int maximoEnemigosT=4;
	protected int maximoEnemigosR=4;
	protected int maximoEnemigosC=3;
	protected int cantidadEnemigos;
	private int segundos=0;
	public PrimeraOleada(Mapa m,Ventana v){
		mapa=m;
		ventana=v;
		cantidadEnemigos=maximoEnemigosR+maximoEnemigosT+maximoEnemigosC;
	}
	public void run(){
		int k=0;
		boolean juego=true;
		while(juego){

			try {
				Thread.sleep(1000);
				if (k<maximoEnemigosT)
					mapa.crearEnemigo(new TanqueCr(0));
				if (k<maximoEnemigosR)
					mapa.crearEnemigo(new Robot(0));
				if (k<maximoEnemigosC)
					mapa.crearEnemigo(new CamionetaBlindada(0));
					
			
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
			
			int x=r.nextInt(18);
			int y=r.nextInt(18);
			int z=q.nextInt(2);
			if(!Mapa.celdas[x][y].ocupada())
				if(z==0) {
					Entidad e=new Piedra();
					e.setX(x);
					e.setY(y);
					Mapa.celdas[x][y].agregarPersonaje(e);
				}
				else{
					objetoConTiempo lilo=new objetoConTiempo(Mapa.celdas[x][y]);
					lilo.start();
				}
					
			segundos=0;
			}
			
				
		}	
	}
}