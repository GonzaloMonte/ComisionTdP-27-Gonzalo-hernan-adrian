package Main;

import Personajes.*;
import Visitor.Visitor;

import java.util.ArrayList;
import java.util.Random;

import Objetos.Bomba;
import Objetos.Congelador;
import Objetos.Corazon;
import Objetos.Escudo;
import Objetos.Objeto;
import Personajes.*;
public class  Mapa {
	public static Celda[][] celdas;
	protected int Dinero;
	protected int Score;
	protected int Base;
	protected int muertos,bombas;
	protected ArrayList<Entidad> listaEntidades;
	protected ArrayList<Entidad> listaAgregar;
	protected ArrayList<Entidad> listaEliminar;
	int k=0;
	protected Ventana ventana;
	public static Mapa mapa;
	
	
	public static Mapa obtenerMapa(Ventana ventana) {
	 if(mapa==null)
		mapa=new Mapa(ventana);
		 return mapa;
	}
	private Mapa(Ventana ventana) {
		this.ventana=ventana;
		Base=100;
		Dinero=1000;
		Score=0;
		celdas= new Celda[20][20];
		for(int i= 0 ; i<celdas.length ; i++) {
			for(int j= 0 ; j<celdas[0].length ; j++) {
				celdas[i][j]= new Celda(i,j);
			}
		}
		
		
		listaEntidades=new ArrayList<Entidad>();
		listaAgregar=new ArrayList<Entidad>();
		listaEliminar=new ArrayList<Entidad>();
	}
	

	public int getDinero(){
		return Dinero;
	}
	
	public int getScore(){
		return Score;
	}
	
	public int getBase(){
		return Base;	
	}
	
	public void agregarEntidad(Entidad e) {		
		listaAgregar.add(e);
		celdas[e.getX()][e.getY()].agregarPersonaje(e);
		}	
	
	
	public void eliminarEntidad(Entidad e) {
		celdas[e.getX()][e.getY()].liberarCelda();
		
		listaEliminar.add(e);
	}
	

	
	public ArrayList<Entidad> listaEntidades(){
		return listaEntidades;
	}
	
	 
	public void setDinero(int d){
		 Dinero=Dinero+d;
	}
	
	public void setScore(int s){
		 Score=Score+s;
	}
	

	public void agregarHeroes(int i,int j,Entidad heroe) {
		Heroe colocar=(Heroe) heroe;

		if (colocar!=null) {
			colocar=(Heroe) colocar.clonar();
			if(colocar.getPrecio()<=Dinero) {
				Dinero=Dinero-colocar.getPrecio();

				colocar.setX(i);
				colocar.setY(j);
				celdas[i][j].agregarPersonaje(colocar);
				listaEntidades.add(colocar);
			}
		}
		
		
	}
	public void crearEnemigoTanque() {
		Random r = new Random();
		int valorDado = r.nextInt(20);
		
		int powerUP = r.nextInt(20);
		Objeto b=null;
		switch(powerUP){
		case 1:  b=new Corazon(1);
		case 2:  b=new Bomba(1,valorDado,0,false);
		case 3:  b=new Escudo(1);
		case 4: b=new Congelador(1);
		}
		Entidad e=null;
		if (b!=null) 
		e=new  TanqueCr(valorDado,b);
		else e=new  TanqueCr(valorDado);
		agregarEntidad(e);
	}
	public void crearEnemigoTanqueCm(){
		Random r = new Random();
		int valorDado = r.nextInt(20);
		
		int powerUP = r.nextInt(10);
		Objeto b=null;
		switch(powerUP){
		case 1:  b=new Corazon(1);
		case 2:  b=new Bomba(1,valorDado,0,false);
		case 3:  b=new Escudo(1);
		case 4: b=new Congelador(1);
		}
		Entidad e=null;
		if (b!=null) 
		e=new  TanqueCm(valorDado,b);
		else e=new  TanqueCm(valorDado);
		agregarEntidad(e);
	}
	public void crearEnemigoRobot() {
		Random r = new Random();
		int valorDado = r.nextInt(20);
		
		int powerUP = r.nextInt(20);
		Objeto b=null;
		switch(powerUP){
		case 1:  b=new Corazon(1);
		case 2:  b=new Bomba(1,valorDado,0,false);
		case 3:  b=new Escudo(1);
		case 4: b=new Congelador(1);
		}
		Entidad e=null;
		if (b!=null) 
		e=new  Robot(valorDado,b);
		else e=new  Robot(valorDado);
		agregarEntidad(e);
	}
	public void crearEnemigoThanos(){
		Random r = new Random();
		int valorDado = r.nextInt(20);
		Entidad e=new  Thanos(valorDado);
		agregarEntidad(e);
	}
	public void ActualizarMapa() {
		for (Entidad e:listaEntidades) {
			e.actualizar();
			
		}
		for (Entidad e2: listaAgregar) {
			listaEntidades.add(e2);

		}
		for (Entidad e3: listaEliminar) {
			listaEntidades.remove(e3);
		}
		listaEliminar=new ArrayList<Entidad>();
		listaAgregar=new ArrayList<Entidad>();
	}
	public void dañoBase(int d) {
		Base=Base-d;
	}
	public int getMuertos() {
		return muertos;
	}
	public void mori() {
		muertos++;
	}
	public int getBombas() {
		return bombas;
	}
	public void setBombas(int b) {
		bombas=b;
	}
	public void curarBase(int x) {
		Base=Base+x;
	}
	public void activador(Objeto o) {
		Visitor v=o.getVisitor();
		for(int i= 0 ; i<celdas.length ; i++) {
			for(int j= 0 ; j<celdas[0].length ; j++) {
				if (celdas[i][j].ocupada()) {
					celdas[i][j].obtenerEntidad().accept(v);
				}
				
			}
		}
	}
}