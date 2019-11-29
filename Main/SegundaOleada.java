package Main;

import java.util.Random;

import Objetos.Piedra;
import Personajes.Nave;
import Personajes.TanqueCm;
import Personajes.Thanos;

public class SegundaOleada<Ventada> extends Thread {
	protected Ventana ventana;
	protected Mapa mapa;
	protected int maximoEnemigosTanque=4;
	protected int maximoEnemigosThanos=1;
	protected int maximoEnemigosNave=4;
	protected int cantidadEnemigos;
	private int segundos;
	public SegundaOleada(Mapa m,Ventana v){
		mapa=m;
		ventana=v;
		cantidadEnemigos=mapa.getMuertos()+maximoEnemigosThanos+maximoEnemigosTanque+maximoEnemigosNave;
	}
	public void run(){
		int k=0;
		boolean juego=true;
		while(juego){

			try {
				Thread.sleep(1000);
				if (k<maximoEnemigosThanos)
					mapa.crearEnemigo(new Thanos(0));
				if (k<maximoEnemigosTanque)
					mapa.crearEnemigo(new TanqueCm(0));
				if (k<maximoEnemigosNave)
					mapa.crearEnemigo(new Nave(0));
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
				ventana.ganar();
			}
			
			segundos++;
			if(segundos==10){
			Random r=new Random();
			
			Random q=new Random();
			
			int x=r.nextInt(18); int y=r.nextInt(18);
			int z=q.nextInt(2);
			if(!Mapa.celdas[x][y].ocupada())
				if(z==0)
					Mapa.celdas[x][y].agregarPersonaje(new Piedra());
				else{
					objetoConTiempo lilo=new objetoConTiempo(Mapa.celdas[x][y]);
					lilo.start();
				}
					
			segundos=0;
			}
			
				
		}	
	}
}