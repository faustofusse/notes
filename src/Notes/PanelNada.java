package Notes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelNada extends JPanel{
	private JLabel label = new JLabel("No tienes ninguna nota");
	public PanelNada(){
		setBackground(Color.white);
		setLayout(new FlowLayout(FlowLayout.CENTER, 0, 150));
		
		
		label.setForeground(Color.gray);
		label.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		add(label);
	}
	
}
