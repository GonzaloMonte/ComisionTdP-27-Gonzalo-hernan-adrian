package Main;

public class PrimeraOleada extends Thread {
	protected Mapa mapa;
	
	public PrimeraOleada(Mapa m){
		mapa=m;
	}
	public void run(){
		int k=0;
		while(true){
			
			System.out.println("elem :"+k );
			try {
				Thread.sleep(1000);
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