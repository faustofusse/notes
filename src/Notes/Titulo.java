package Notes;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;

public class Titulo extends JTextField{
	public Titulo(){
		setText("Titulo de la nota");
		setBorder(null);
		setForeground(Color.gray);
		setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		addFocusListener(new Focus());
		
	}
}
