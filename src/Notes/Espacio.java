package Notes;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class Espacio extends JPanel{
	public Espacio (int w, int h, Color c){
		setPreferredSize(new Dimension(w,h));
		setBackground(c);
	}
}
