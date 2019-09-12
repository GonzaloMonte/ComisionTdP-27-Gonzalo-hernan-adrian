package Main;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {
	protected JLabel [][] celdas;
	protected JPanel panelPrincipal;
	protected Mapa mapa;
	
	
	public Ventana() {
		super ("Avengers Defense");
		mapa = new Mapa();
		setDefaultCloseOperation (EXIT_ON_CLOSE);
		setSize(new Dimension(700,700));
		
		iniciarGUI();
		setVisible(true);
	}
	
	private void iniciarGUI() {
		this.setLayout(new GridLayout(1,1));
		this.setResizable(false);
		panelPrincipal= new JPanel();
		panelPrincipal.setLayout(new GridLayout(30,30));
		iniciarMatriz();
		this.add(panelPrincipal);
		
		
	}
	
	private void iniciarMatriz() {
		
		celdas= new JLabel[30][30];
		for(int i=0 ; i<celdas.length; i++) {
			for(int j=0 ; j<celdas[0].length ; j++) {
				celdas[i][j] = new JLabel();
				celdas[i][j].setIcon(new ImageIcon("img/"+mapa.queCeldaEs(i,j)+".jpg"));
				
				panelPrincipal.add(celdas[i][j]);
				
			}
		}
	}
	

}
