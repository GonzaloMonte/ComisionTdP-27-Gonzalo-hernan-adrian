package Main;

import Personajes.*;
import Personajes.IronMan;

public class Mapa {
	protected Celda[][] celdas;
	protected Pair[] camino1,camino2,camino3;
	int k=0;
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
		crearCeldaAmiga(9,0,14,5);
		crearCeldaAmiga(18,0,29,5);
		crearCeldaAmiga(9,8,14,18);
		crearCeldaAmiga(18,8,23,18);
		crearCeldaAmiga(26,8,29,18);
		crearCeldaAmiga(0,22,5,29);
		crearCeldaAmiga(9,22,22,29);
		crearCeldaEnemiga(6,0,8,29);
		crearCeldaEnemiga(15,0,17,21);
		crearCeldaEnemiga(6,6,29,8);
		crearCeldaEnemiga(0,19,29,21);
		crearCeldaEnemiga(23,6,25,29);
		
		crearCaminos();
		crearExtras();
		
	}
	
	private void crearExtras() {
	 

		
	}
	private void crearCaminos() {
	camino1=new Pair[45];
	camino1[0]=new Pair(7,0);
	camino1[1]=new Pair(7,1);		
	camino1[2]=new Pair(7,2);		
	camino1[3]=new Pair(7,3);		
	camino1[4]=new Pair(7,4);		
	camino1[5]=new Pair(7,5);		
	camino1[6]=new Pair(7,6);		
	camino1[7]=new Pair(7,7);		
	camino1[8]=new Pair(7,7);		
	camino1[9]=new Pair(8,7);		
	camino1[10]=new Pair(9,7);		
	camino1[11]=new Pair(10,7);		
	camino1[12]=new Pair(11,7);		
	camino1[13]=new Pair(12,7);		
	camino1[14]=new Pair(13,7);		
	camino1[15]=new Pair(14,7);		
	camino1[16]=new Pair(15,7);		
	camino1[17]=new Pair(16,7);		
	camino1[18]=new Pair(16,8);		
	camino1[19]=new Pair(16,9);		
	camino1[20]=new Pair(16,10);		
	camino1[21]=new Pair(16,11);		
	camino1[22]=new Pair(16,12);		
	camino1[23]=new Pair(16,13);		
	camino1[24]=new Pair(16,14);		
	camino1[25]=new Pair(16,15);		
	camino1[26]=new Pair(16,16);		
	camino1[27]=new Pair(16,17);		
	camino1[28]=new Pair(16,18);		
	camino1[29]=new Pair(16,19);		
	camino1[30]=new Pair(16,20);		
	camino1[31]=new Pair(17,20);		
	camino1[32]=new Pair(18,20);		
	camino1[33]=new Pair(19,20);		
	camino1[34]=new Pair(20,20);		
	camino1[35]=new Pair(21,20);		
	camino1[36]=new Pair(22,20);		
	camino1[37]=new Pair(23,20);		
	camino1[38]=new Pair(24,20);		
	camino1[39]=new Pair(24,20);		
	camino1[40]=new Pair(24,21);		
	camino1[41]=new Pair(24,22);		
	camino1[42]=new Pair(24,23);		
	camino1[43]=new Pair(24,24);		
	camino1[44]=new Pair(24,25);		
			

	}

	public Pair[] getCamino1(){
		return camino1;
	}
	
	public String queCeldaEs(int i,int j) {
		return celdas[i][j].queSoy();
	}
		

}
	
	
	

