package co.edu.unbosque.View;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Img_fondo extends JPanel {

public JLabel fondo;
	
	public Img_fondo() {
		
		fondo = new JLabel();
		fondo.setBounds(0, 0, 2000, 2000);
		add(fondo);		
	}
	
}
