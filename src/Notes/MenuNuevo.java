package Notes;

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

public class MenuNuevo extends JPanel implements ActionListener{
	private JButton btnMenu = new JButton(new ImageIcon("src/Notes/img/menu3.png"));
	private JLabel titulo = new JLabel("Notes");
	public MenuNuevo(){
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		setBackground(new Color(3,171,244));
		setPreferredSize(new Dimension(444,60));
		
		add(new Espacio(5,60,new Color(3,171,244)));
		
		btnMenu.setBorder(null);
		btnMenu.addActionListener(this);
		add(btnMenu);
		
		titulo.setForeground(Color.white);
		titulo.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		add(titulo);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Hola soy fausto");
		
		//Main.ventana1.notas.addBtn(PanelNuevaNota.titulo.getText());
		PanelNotas.hayNotas = true;
		Main.ventana1.notas.addBtn(PanelNuevaNota.titulo.getText());
		Main.ventana1.removePaneles();
		Main.ventana1.setPanelNotas();
		Main.ventana1.reload();
	}
}
