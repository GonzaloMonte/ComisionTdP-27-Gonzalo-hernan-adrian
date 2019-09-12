package Main;

import Personajes.IronMan;

public class Mapa {
	protected Celda[][] celdas;
	
	
	public Mapa() {
		celdas= new Celda[30][30];
		for(int i= 0 ; i<celdas.length ; i++) {
			for(int j= 0 ; j<celdas[0].length ; j++) {
				celdas[i][j]= new Celda(i,j);
			}
		}
		crearMapa();
		celdas[0][3].agregarPersonaje(new IronMan());
	}
	private void crearCeldaAmiga(int filaesqsup , int columesqsup,int  filaesqinf, int columesqinf) {
			for(int i=filaesqsup ; i<filaesqinf+1 ; i++) {
				for(int j=columesqsup ; j<columesqinf+1 ; j++) {
					celdas[i][j]=new CeldaAmiga(i,j);
			}
		}
	}
	private void crearCeldaEnemiga(int filaesqsup , int columesqsup,int  filaesqinf, int columesqinf) {
		for(int i=filaesqsup ; i<filaesqinf+1 ; i++) {
			for(int j=columesqsup ; j<columesqinf+1 ; j++) {
				celdas[i][j]=new CeldaEnemiga(i,j);
			}
		}
	}
	public void crearMapa() {
		crearCeldaAmiga(0,0,5,18);
		crearCeldaAmiga(7,0,14,5);
		crearCeldaAmiga(18,0,29,5);
		crearCeldaAmiga(7,8,14,18);
		crearCeldaAmiga(18,8,23,18);
		crearCeldaAmiga(26,8,29,18);
		crearCeldaAmiga(0,22,5,29);
		crearCeldaAmiga(7,22,22,29);
		crearCeldaEnemiga(6,0,9,29);
		crearCeldaEnemiga(15,0,17,21);
		crearCeldaEnemiga(6,6,29,8);
		crearCeldaEnemiga(0,19,29,21);
		crearCeldaEnemiga(23,6,25,29);
	}
	public String queCeldaEs(int i,int j) {
		return celdas[i][j].queSoy();
	}
}
	
	
	

