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
	
	static public Mapa getMapa() {
		if(mapa==null) {
			mapa=new Mapa();
			}
		return mapa;
		}
	
	
	}

