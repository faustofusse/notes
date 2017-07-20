package Notes;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BtnEliminar extends JButton{

	public BtnEliminar(){
		setIcon(new ImageIcon("src/Notes/img/delete_white.png"));
		setBackground(Const.COLOR_GRIS);
		setBorder(null);
		setPreferredSize(new Dimension(60,60));
	}
	
}
