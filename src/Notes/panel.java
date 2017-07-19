package Notes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class panel extends JPanel{
	
	public panel (){
		setBackground(Color.green);
		setBounds(0,0,400,400);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		g.setColor(new Color(7,174,240));
		Rectangle2D rect = new Rectangle(20,20,60,60);
		g2.fill(rect);
		
		g.setColor(Color.white);
		Rectangle2D masV = new Rectangle(45,35,10,30);
		Rectangle2D masH = new Rectangle(35,45,30,10);
		g2.fill(masV);
		g2.fill(masH);
	}
}
