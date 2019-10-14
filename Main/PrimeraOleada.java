package Main;

public class PrimeraOleada<Ventada> extends Thread {
	protected Ventana ventana;
	protected Mapa mapa;
	protected int maximoEnemigos=5;
	
	public PrimeraOleada(Mapa m,Ventana v){
		mapa=m;
		ventana=v;
	}
	public void run(){
		int k=0;
		while(true){

			try {
				Thread.sleep(1000);
				if (k<maximoEnemigos)
				mapa.CrearEnemigo1();
				k++;
				mapa.ActualizarMapa();
				ventana.armarEscenario();
				
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		
				
		}	
	}
}