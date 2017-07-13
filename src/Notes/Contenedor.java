package Notes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class Contenedor extends JPanel{
	private Menu menu = new Menu();
	private PanelNotas notas = new PanelNotas();
	public Contenedor(){
		setLayout(new BorderLayout(0,0));
		add(menu, BorderLayout.NORTH);
		add(notas, BorderLayout.CENTER);
	}
}
