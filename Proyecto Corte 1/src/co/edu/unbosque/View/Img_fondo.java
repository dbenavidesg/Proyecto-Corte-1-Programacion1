package co.edu.unbosque.View;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Img_fondo extends JPanel {

public JLabel fondo;
	
	public Img_fondo() {
		
//		setLayout(null);
		
		fondo = new JLabel();
		fondo.setBounds(0, 0, 950, 750);
		add(fondo);	
		
//		setVisible(true);
	}
	
}
