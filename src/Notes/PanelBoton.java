package Notes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBoton extends JPanel{
	public PanelBoton(String titulo){
		setLayout(new BorderLayout());
		//setPreferredSize(new Dimension(Main.ventana1.getSize().width, 60));
		
		System.out.println();
		
		JButton btnTitulo = new JButton(titulo);
		btnTitulo.setBackground(Color.WHITE);
		btnTitulo.setBorder(null);
		add(btnTitulo, BorderLayout.CENTER);
	}
}
