package Main;

import Personajes.CapitanAmerica;
import Personajes.Hulk;
import Personajes.IronMan;
import Personajes.Entidad;
import Personajes.SpiderMan;
import Personajes.Thor;

public class PrimerOleada extends Thread {
	protected Mapa mapa;
	
	public PrimerOleada(Mapa m){
		mapa=m;
	}
	public void run(){
		int k=0;
		while(true){
			
			System.out.println("elem :"+k );
			try {
				Thread.sleep(10);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			mapa.mover(k);
			if(k<mapa.getOleada1().length-1)
				k++; 
				
		}	
	}
}
