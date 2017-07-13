package Notes;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class PanelNotas extends JPanel{
	public PanelNotas(){
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setBackground(Color.white);
		add(new PanelBoton("Primera nota de fausto"));
	}
}
