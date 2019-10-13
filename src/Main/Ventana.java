package Main;

import java.awt.*;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.*;

import Personajes.*;
	
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.awt.EventQueue;
import java.awt.event.*;


public class Ventana extends JFrame implements KeyListener {
	protected JButton [][] celdas;
	protected JButton [] heroes;
	protected JLabel Dinero,Score,VidaDeLaBase;
	protected JPanel panelPrincipal,panelTienda;
	protected ContadorTiempo contador;
	protected String heroe;
	
	protected Mapa mapa;
	
	public Ventana() {
		super ("Avengers Defense");
		mapa =Mapa.mapa.obtenerMapa(this);
		setDefaultCloseOperation (EXIT_ON_CLOSE);
		setSize(new Dimension(600,500));
		
		iniciarGUI();
		setVisible(true);
	}
	
	private void iniciarGUI() {

		this.setResizable(true);
		panelPrincipal= new JPanel();
		panelTienda=new JPanel();
		
		panelPrincipal.setSize(700, 500);
		panelPrincipal.setLayout(new GridLayout(30,30));
		iniciarMatriz();
		armarTienda();
		armarEscenario();
		
		getContentPane().add(panelPrincipal,BorderLayout.CENTER);
		getContentPane().add(panelTienda,BorderLayout.EAST);
		
		mapa.primerOleada();
	}
	
	
	private void armarTienda() {
		panelTienda.setSize(700, 200);
		panelTienda.setLayout(new GridLayout(8,1));
				
		heroes=new JButton[5];
		heroes[0]=new JButton("Spiderman");
		heroes[1]=new JButton("CapitanAmerica");
		heroes[2]=new JButton("Hulk");
		heroes[3]=new JButton("IronMan");
		heroes[4]=new JButton("Thor");
		
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


		Dinero=new JLabel("Dinero :      ");
		Score=new JLabel(" Score   :");
		VidaDeLaBase=new JLabel("Base    :");;
		
		OyenteBoton oyenteB=new OyenteBoton();
		heroes[0].addActionListener(oyenteB);
		heroes[1].addActionListener(oyenteB);
		heroes[2].addActionListener(oyenteB);
		heroes[3].addActionListener(oyenteB);
		heroes[4].addActionListener(oyenteB);
							

				
		panelTienda.add(heroes[0]);
		panelTienda.add(heroes[1]);
		panelTienda.add(heroes[2]);
		panelTienda.add(heroes[3]);
		panelTienda.add(heroes[4]);
		panelTienda.add(Dinero);
		panelTienda.add(Score);
		panelTienda.add(VidaDeLaBase);

	}


	private void iniciarMatriz() {
		
		celdas= new JButton[30][30];
		OyenteCelda oyenteC=new OyenteCelda();
		for(int i=0 ; i<celdas.length; i++) {
			for(int j=0 ; j<celdas[0].length ; j++) {
				celdas[i][j]=new JButton();
				celdas[i][j].setIcon(new ImageIcon("img\\"+mapa.queCeldaEs(i,j)+".jpg"));
				celdas[i][j].addActionListener(oyenteC);
				celdas[i][j].setActionCommand(i+" "+j);
				panelPrincipal.add(celdas[i][j]);
				
			}
		}
	}
	
	public Enemigo empezarOleada(){
		Enemigo e1=new Enemigo(1,1,1,mapa.getCamino1());
		mapa.agregarEnemigo(e1);
		return e1;
		}

	
	public void colocarEnemigo(Enemigo e1){
		
		if(e1.getY()==7||e1.getY()==20||e1.getY()==8)
			celdas[e1.getX()][e1.getY()].setIcon(new ImageIcon("img\\TanqueCr_V.jpg"));
		else
			celdas[e1.getX()][e1.getY()].setIcon(new ImageIcon("img\\TanqueCr_H.jpg"));


	}

	public void limpiarCelda(int x, int y) {

		celdas[x][y].setIcon(new ImageIcon("img\\celdaEnemiga.jpg"));


		//celdas[x][y].setIcon(new ImageIcon("C:/Users/adm/Documents/GitHub/ComisionTdP-27-Gonzalo-hernan-adrian/src/img/celdaEnemiga.jpg"));
		celdas[x][y].setIcon(new ImageIcon("img\\celdaEnemiga.jpg"));

	}	

	
	class OyenteBoton implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			heroe=(String)e.getActionCommand();
			for(int i=0;i<celdas.length;i++)
				for(int j=0;j<celdas[0].length;j++)
					if(mapa.queCeldaEs(i, j).equals("celdaAliada") && mapa.obtenerHeroe(i, j)==null)
						celdas[i][j].setIcon(new ImageIcon("img\\celdaAliada_Colocar.gif"));
		}
	}
	
	class OyenteCelda implements ActionListener{

		public void actionPerformed(ActionEvent e) {
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
			if (heroe!=null)
			if(mapa.queCeldaEs(i,j).equals("celdaAliada"))
				if((mapa.queCeldaEs(i,j).equals("celdaAliada"))) {
					celdas[i][j].setIcon(new ImageIcon("img\\"+heroe+".jpg"));
					mapa.agregarHeroes(i,j,heroe);
				}
		}
	}

	public void keyPressed(KeyEvent e) {
		
		 if (KeyEvent.VK_ESCAPE==e.getKeyCode()) {
			 Enemigo e1=mapa.listaEnemigosVivos().get(0);
			 e1.setVida(0);
			 limpiarCelda(e1.getX(),e1.getY());
			 mapa.actualizarEnemigo();
			 Score.setText("Score: "+mapa.getScore());
		 }
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	private void armarEscenario() {
		
		
	}
}
