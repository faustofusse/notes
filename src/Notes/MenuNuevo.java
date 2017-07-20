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
		setBackground(Const.COLOR_FONDO);
		setPreferredSize(new Dimension(444,60));
		
		add(new Espacio(5,60,Const.COLOR_FONDO));
		
		btnMenu.setBorder(null);
		btnMenu.addActionListener(this);
		add(btnMenu);
		
		titulo.setForeground(Color.white);
		titulo.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		add(titulo);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Main.ventana1.panelNotas.addBtn(Main.ventana1.panelNuevo.titulo.getText(), Main.ventana1.panelNuevo.parrafo.getText());
		//Main.ventana1.setPanelNotas();
		
		Main.ventana1.panelNuevo.guardarNota();
		PanelNotas.notaAbierta = -1;
		
	}
}
