package Main;

public class ContadorTiempo extends Thread{
	public void run(){
		while(true)
			try {
				Thread.sleep(1000);
				
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
}
