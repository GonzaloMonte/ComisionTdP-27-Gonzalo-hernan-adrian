package Main;

public class Mapa {
	static private Mapa mapa;
	protected Celda[][] celdas;
	
	
	private Mapa() {
		celdas= new Celda[29][29];
		for(int i= 0 ; i<celdas.length ; i++) {
			for(int j= 0 ; j<celdas[0].length ; j++) {
				celdas[i][j]= new Celda(i,j);
			}
		}
	}
	private void CrearCeldaAmiga(int filaesqsup , int columesqsup,int  filaesqinf, int columesqinf) {
			for(int i=filaesqsup ; i<filaesqinf+1 ; i++) {
				for(int j=columesqsup ; j<columesqsup+1 ; j++) {
					celdas[i][j]=new CeldaAmiga(i,j);
			}
		}
	}
	private void CrearCeldaEnemiga(int filaesqsup , int columesqsup,int  filaesqinf, int columesqinf) {
		for(int i=filaesqsup ; i<filaesqinf+1 ; i++) {
			for(int j=columesqsup ; j<columesqsup+1 ; j++) {
				celdas[i][j]=new CeldaEnemiga(i,j);
		}
	}
}
	static public Mapa getMapa() {
		if(mapa==null) {
			mapa=new Mapa();
			}
		return mapa;
		}
	
	
	}

