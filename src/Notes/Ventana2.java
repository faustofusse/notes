package Notes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Ventana2 extends JFrame{
	
	private JPanel panelP = new JPanel();
	private JPanel panel2 = new JPanel();
	private JButton boton = new JButton("Hola");
	private JScrollPane scroll = new JScrollPane();
	
	public Ventana2 (){
		setLayout(new BorderLayout());
		setSize(444,438);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//scroll.setBounds(0,0, 444,438);
		
		panel2.setBackground(Color.blue);
		panel2.setPreferredSize(new Dimension(100,30));
		
		boton.setBounds(100, 500, 100, 20);
		
		panelP.setPreferredSize(new Dimension(0, 520));
		panelP.setBackground(Color.green);
		panelP.setLayout(null);
		panelP.add(boton);
		
		scroll.setViewportView(panelP);
		
		add(panel2, BorderLayout.NORTH); 
		add(scroll, BorderLayout.CENTER);
	}

}
