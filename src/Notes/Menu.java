package Notes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu extends JPanel implements ActionListener{
	private JButton btnMenu = new JButton(new ImageIcon("src/Notes/img/menu3.png"));
	private JLabel titulo = new JLabel("Notes");
	public Menu(){
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		setBackground(new Color(3,171,244));
		setPreferredSize(new Dimension(444,60));
		
		add(new Espacio(5,60,new Color(3,171,244)));
		
		btnMenu.addActionListener(this);
		btnMenu.setBorder(null);
		add(btnMenu);
		
		titulo.setForeground(Color.white);
		titulo.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		add(titulo);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Main.ventana1.notas.addBtn("Hola soy fausto");
		
		if (!PanelNotas.hayNotas){
			PanelNotas.hayNotas = true;
			Main.ventana1.remove(Main.ventana1.nada);
			Main.ventana1.add(Main.ventana1.scroll, BorderLayout.CENTER);
		}
		
		Main.ventana1.notas.setPreferredSize(new Dimension(300,PanelNotas.botones.size()*66));
		Main.ventana1.reload();
	}
}
