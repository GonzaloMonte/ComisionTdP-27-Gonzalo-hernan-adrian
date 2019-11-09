package Main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;

import Objetos.Bomba;

import javax.swing.*;

import Personajes.*;
import Visitor.Visitor;
import Visitor.VisitorMapa;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.*;


public class Ventana extends JFrame implements KeyListener {
	protected JButton [][] celdas;
	protected Boton [] heroes;
	protected JButton objeto;
	protected JLabel Dinero,Score,VidaDeLaBase,juego,bombas;
	protected JPanel panelPrincipal,panelTienda,Panel;
	protected ContadorTiempo contador;
	protected Entidad heroe;
	protected Mapa mapa;

	 private JButton play;
	 private JPanel fondo;
	 private JLabel imagen;
	 private int i=0;
	 
	public Ventana() {
		super ("Avengers Defense");
		mapa =Mapa.obtenerMapa(this);

		setDefaultCloseOperation (EXIT_ON_CLOSE);
		setSize(new Dimension(600,500));
		

		menu();
		setVisible(true);
	}
	private void menu(){
		fondo=new JPanel();
		fondo.setLayout(new BorderLayout());
		
		 play=new JButton();
		 play.setBackground(Color.black);
		 play.setIcon(new ImageIcon("img\\Avenger_Tienda.jpg"));
		OyentePlay oyente=new OyentePlay();
		play.addActionListener(oyente);
		fondo.add(play);

		getContentPane().add(fondo);
		
	}
	class OyentePlay implements ActionListener{		
		public void actionPerformed(ActionEvent e) {
			if(i==0){
				play.setIcon(new ImageIcon("img\\instrucciones.png"));
				i++;
			}
			
			else{
			play.setEnabled(false);
			fondo.setEnabled(false);
			iniciarGUI();
			getContentPane().remove(play);
			getContentPane().remove(fondo);
		
			}
		}
	}
	
	
	private void iniciarGUI() {

		this.setResizable(true);
		panelPrincipal= new JPanel();
		panelTienda=new JPanel();
		
		
		juego=new JLabel();
		Panel=new JPanel();
		Panel.setSize(600, 500);

		Panel.add(juego);
		
		panelPrincipal.setSize(700, 500);
		panelPrincipal.setLayout(new GridLayout(20,20));
		iniciarMatriz();
		armarTienda();
		armarEscenario();
		
		getContentPane().add(panelPrincipal,BorderLayout.CENTER);
		getContentPane().add(panelTienda,BorderLayout.EAST);
		PrimeraOleada<Ventana> e=new PrimeraOleada<Ventana>(mapa,this);
		e.start();
	}
	
	
	private void armarTienda() {
		panelTienda.setSize(700, 200);
		panelTienda.setLayout(new GridLayout(10,1));
		
		objeto=new JButton();
		bombas=new JLabel();
		objeto.setIcon(new ImageIcon("img\\bombaTienda.png"));
		bombas=new JLabel("Cantidad de Bombas : "+Mapa.mapa.getBombas());
		objeto.setSize(10,10);
		OyenteBoton oyenteB=new OyenteBoton();
		objeto.addActionListener(oyenteB);
		heroes=new Boton[5];
		
		Entidad e=new SpiderMan();
		heroes[0]=new Boton(e,this);
		e=new CapitanAmerica();
		heroes[1]=new Boton(e,this);
		e=new Hulk();
		heroes[2]=new Boton(e,this);
		e=new IronMan();
		heroes[3]=new Boton(e,this);
		e=new Thor();
		heroes[4]=new Boton(e,this);

		heroes[0].setBackground(Color.RED);
		heroes[1].setBackground(Color.BLUE);
		heroes[2].setBackground(Color.GREEN);
		heroes[3].setBackground(Color.YELLOW);
		heroes[4].setBackground(Color.GRAY);

		
		heroes[0].setIcon(new ImageIcon("img\\SpiderMan_Tienda.png"));
		heroes[1].setIcon(new ImageIcon("img\\CapitanAmerica_Tienda.png"));
		heroes[2].setIcon(new ImageIcon("img\\Hulk_Tienda.png"));
		heroes[3].setIcon(new ImageIcon("img\\IronMan_Tienda.png"));
		heroes[4].setIcon(new ImageIcon("img\\Thor_Tienda.png"));


		Dinero=new JLabel("Dinero : "+Mapa.mapa.getDinero());
		Score=new JLabel("Score : "+Mapa.mapa.getScore());
		VidaDeLaBase=new JLabel("Base : "+Mapa.mapa.getBase());
		

				
		panelTienda.add(heroes[0]);
		panelTienda.add(heroes[1]);
		panelTienda.add(heroes[2]);
		panelTienda.add(heroes[3]);
		panelTienda.add(heroes[4]);
		panelTienda.add(objeto);
		panelTienda.add(bombas);
		panelTienda.add(Dinero);
		panelTienda.add(Score);
		panelTienda.add(VidaDeLaBase);

	}


	private void iniciarMatriz() {
		
		celdas= new JButton[20][20];
		OyenteCelda oyenteC=new OyenteCelda();
		for(int i=0 ; i<celdas.length; i++) {
			for(int j=0 ; j<celdas[0].length ; j++) {
				celdas[i][j]=new JButton();
				celdas[i][j].setIcon(celdas[i][j].getIcon());
				celdas[i][j].addActionListener(oyenteC);
				celdas[i][j].setActionCommand(i+" "+j);
				panelPrincipal.add(celdas[i][j]);
				
			}
		}
	}
	//Para agregar heroes

	
	class OyenteCelda implements ActionListener{
		protected Visitor visitorMapa;
		public void actionPerformed(ActionEvent e) {
			visitorMapa=new VisitorMapa();
			String coordenadas=(String)e.getActionCommand();
			String x="",y="";
			int i,j,recorre=0;
			
			while(coordenadas.charAt(recorre)!=' '){
				x+=coordenadas.charAt(recorre);
				recorre++;
			}
			i=Integer.parseInt(x);
			recorre++;
			while(recorre<coordenadas.length()){
				y+=coordenadas.charAt(recorre);
				recorre++;
			}
			j=Integer.parseInt(y);
			if (Mapa.celdas[i][j].ocupada()) {
				Mapa.celdas[i][j].personaje.accept(visitorMapa);
				heroe=null;
			}
			else
				if (!objeto.isEnabled() && !Mapa.celdas[i][j].ocupada()) {
					Entidad entidad=new Bomba(1,i,j,true);		
					mapa.agregarEntidad(entidad);
					mapa.setBombas(mapa.getBombas()-1);
					objeto.setEnabled(true);
				}
				else
					if (
							heroe!=null && !Mapa.celdas[i][j].ocupada())
						mapa.agregarHeroes(i,j,heroe);
				
		}
	}

	public void keyPressed(KeyEvent e) {
		
		 if (KeyEvent.VK_ESCAPE==e.getKeyCode()) {
			 
			 
			 Score.setText("Score: "+mapa.getScore());
		 }
	}


	public void keyReleased(KeyEvent arg0) {
		
		
	}


	public void keyTyped(KeyEvent arg0) {
		
		
	}
	
	public void armarEscenario() {
		Dinero.setText("Dinero : "+Mapa.mapa.getDinero());
		Score.setText("Score : "+Mapa.mapa.getScore());
		VidaDeLaBase.setText("Base : "+Mapa.mapa.getBase());
		bombas.setText("Cantidad de Bombas : "+Mapa.mapa.getBombas());
		for(int i=0;i<celdas.length;i++) {
			for(int j=0;j<celdas[0].length;j++) {
				
				
					celdas[i][j].setIcon(Mapa.celdas[i][j].getLabel().getIcon());
				}
		}
		
	}
	public void perder() {

		getContentPane().remove(panelPrincipal);
	
		juego.setIcon(new ImageIcon("img\\Juego_Perdido.jpg"));
		getContentPane().add(Panel);
		Panel.setVisible(true);
	}
	public void ganar(){

		getContentPane().remove(panelPrincipal);
		juego.setIcon(new ImageIcon("img\\Juego_Ganado.jpg"));
		getContentPane().add(Panel);
		Panel.setVisible(true);
	}
	public void setHeroe(Entidad e) {
		heroe=e;
	}
	class OyenteBoton implements ActionListener{


			public void actionPerformed(ActionEvent e) {
				if (Mapa.mapa.getBombas()>0) {
					objeto.setEnabled(false);
				}
		
		}
	}
}

