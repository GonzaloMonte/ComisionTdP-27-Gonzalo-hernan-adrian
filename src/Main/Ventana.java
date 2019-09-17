package Main;

import java.awt.*;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Personajes.*;

public class Ventana extends JFrame {
	protected JLabel [][] celdas;

	protected JButton [] heroes;
	protected JLabel Dinero,Score,VidaDeLaBase;
	protected JPanel panelPrincipal,panelTienda;
	protected ContadorTiempo contador;
	
	protected Mapa mapa;

	//quiero ir al grupo de lucas y boris 
	public Ventana() {
		super ("Avengers Defense");
		mapa = new Mapa();
		setDefaultCloseOperation (EXIT_ON_CLOSE);
		setSize(new Dimension(700,700));
		
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
		
		getContentPane().add(panelPrincipal,BorderLayout.WEST);
		getContentPane().add(panelTienda,BorderLayout.EAST);
		contador=new ContadorTiempo(this,mapa);
		contador.start();
	}
	
	private void armarTienda() {
		panelTienda.setSize(700, 200);
		panelTienda.setLayout(new GridLayout(8,1));
				
		heroes=new JButton[5];
		heroes[0]=new JButton();
		heroes[1]=new JButton();
		heroes[2]=new JButton();
		heroes[3]=new JButton();
		heroes[4]=new JButton();
		
		heroes[0].setIcon(new ImageIcon("C:/Users/Hernan/Documents/GitHub/ComisionTdP-27-Gonzalo-hernan-adrian/src/img/SpiderMan_Tienda.png"));
		heroes[1].setIcon(new ImageIcon("C:/Users/Hernan/Documents/GitHub/ComisionTdP-27-Gonzalo-hernan-adrian/src/img/CapitanAmerica_Tienda.png"));
		heroes[2].setIcon(new ImageIcon("C:/Users/Hernan/Documents/GitHub/ComisionTdP-27-Gonzalo-hernan-adrian/src/img/Hulk_Tienda.png"));
		heroes[3].setIcon(new ImageIcon("C:/Users/Hernan/Documents/GitHub/ComisionTdP-27-Gonzalo-hernan-adrian/src/img/IronMan_Tienda.png"));
		heroes[4].setIcon(new ImageIcon("C:/Users/Hernan/Documents/GitHub/ComisionTdP-27-Gonzalo-hernan-adrian/src/img/Thor_Tienda.png"));

		Dinero=new JLabel("Dinero :      ");
		Score=new JLabel(" Score   :");
		VidaDeLaBase=new JLabel("Base    :");;
		
		
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
		
		celdas= new JLabel[30][30];
		for(int i=0 ; i<celdas.length; i++) {
			for(int j=0 ; j<celdas[0].length ; j++) {
				celdas[i][j] = new JLabel();
				celdas[i][j].setIcon(new ImageIcon("C:/Users/Hernan/Documents/GitHub/ComisionTdP-27-Gonzalo-hernan-adrian/src/img/"+mapa.queCeldaEs(i,j)+".jpg"));
				
				
					if((i==5 && j==19)||(i==27 && j==6)){
						celdas[i][j].setIcon(new ImageIcon("C:/Users/Hernan/Documents/GitHub/ComisionTdP-27-Gonzalo-hernan-adrian/src/img/BarreraHI.png"));}
					else
						if((i==5 && j==20) || (i==27 && j==7)){
							celdas[i][j].setIcon(new ImageIcon("C:/Users/Hernan/Documents/GitHub/ComisionTdP-27-Gonzalo-hernan-adrian/src/img/BarreraHC.png"));}
						else
							if((i==27 && j==8)||(j==21 && i==5)){
								celdas[i][j].setIcon(new ImageIcon("C:/Users/Hernan/Documents/GitHub/ComisionTdP-27-Gonzalo-hernan-adrian/src/img/BarreraHD.png"));}
				
					if(j==9 || j==18)
						if(i==8)	
							celdas[i][j].setIcon(new ImageIcon("C:/Users/Hernan/Documents/GitHub/ComisionTdP-27-Gonzalo-hernan-adrian/src/img/BarreraVAb.png"));
						else
							if(i==7)
								celdas[i][j].setIcon(new ImageIcon("C:/Users/Hernan/Documents/GitHub/ComisionTdP-27-Gonzalo-hernan-adrian/src/img/BarreraVC.png"));
							else
								if(i==6)
									celdas[i][j].setIcon(new ImageIcon("C:/Users/Hernan/Documents/GitHub/ComisionTdP-27-Gonzalo-hernan-adrian/src/img/BarreraVAr.png"));
				
				panelPrincipal.add(celdas[i][j]);
				
			}
		}
	}
	
	public Enemigo empezarOleada(){
		mapa.crearMapa();
		Enemigo e1=new TanqueCr(mapa.getCamino1());
		return e1;}
	public void colocarEnemigo(Enemigo e1){
		
		if(e1.getY()==7||e1.getY()==20)
			celdas[e1.getX()][e1.getY()].setIcon(new ImageIcon("C:/Users/Hernan/Documents/GitHub/ComisionTdP-27-Gonzalo-hernan-adrian/src/img/TanqueCr_V.jpg"));

		else	
			celdas[e1.getX()][e1.getY()].setIcon(new ImageIcon("C:/Users/Hernan/Documents/GitHub/ComisionTdP-27-Gonzalo-hernan-adrian/src/img/TanqueCr_H.jpg"));
		
	}

	public void limpiarCelda(int x, int y) {
		celdas[x][y].setIcon(new ImageIcon("C:/Users/Hernan/Documents/GitHub/ComisionTdP-27-Gonzalo-hernan-adrian/src/img/celdaEnemiga.jpg"));
	}

	

}
