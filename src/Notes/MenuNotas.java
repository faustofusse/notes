package Notes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuNotas extends JPanel implements ActionListener{

	private JButton btnMas = new JButton("+");
	private JLabel titulo = new JLabel("Notes");
	
	public MenuNotas(){
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		setBackground(new Color(3,171,244));
		setPreferredSize(new Dimension(444,60));
		
		ponerComponentes();
	}
	
	private void ponerComponentes(){
		btnMas.addActionListener(this);
		btnMas.setBackground(new Color(3,171,244));
		btnMas.setForeground(Color.white);
		btnMas.setPreferredSize(new Dimension(60,60));
		btnMas.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
		btnMas.setBorder(null);
		
		titulo.setForeground(Color.white);
		titulo.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		
		add(new Espacio(20, 60, new Color(3,171,244)));
		add(titulo);
		add(new Espacio(290, 60, new Color(3,171,244)));
		add(btnMas);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/*
		Main.ventana1.notas.addBtn("Hola soy fausto");
		
		if (!PanelNotas.hayNotas){
			PanelNotas.hayNotas = true;
			Main.ventana1.remove(Main.ventana1.nada);
			Main.ventana1.add(Main.ventana1.scroll, BorderLayout.CENTER);
		}
		
		Main.ventana1.notas.setPreferredSize(new Dimension(300,PanelNotas.botones.size()*66));
		Main.ventana1.reload();
		*/
		Main.ventana1.nuevo.iniciar();
		Main.ventana1.setPanelNuevo();
	}
	
}
