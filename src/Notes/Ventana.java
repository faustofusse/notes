package Notes;

import javax.swing.JFrame;

public class Ventana extends JFrame{
	public static Contenedor contenedor = new Contenedor();
	public Ventana(){
		setBounds(400,100,444,438);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(contenedor);
	}
}
