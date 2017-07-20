package Notes;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextArea;

public class Parrafo extends JTextArea{

	public Parrafo(){
		setText("Escribe el texto aqui");
		setBorder(null);
		setForeground(Color.gray);
		setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		addFocusListener(new Focus());
	}
	
}
