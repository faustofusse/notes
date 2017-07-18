package Notes;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Focus implements FocusListener{

	@Override
	public void focusGained(FocusEvent e) {
		if(e.getSource() == PanelNuevaNota.titulo){
			if (!PanelNuevaNota.tCambiado){
				PanelNuevaNota.titulo.setText("");
				PanelNuevaNota.titulo.setForeground(Color.BLACK);
				PanelNuevaNota.tCambiado = true;
			}
		}else{
			if (!PanelNuevaNota.pCambiado){
				PanelNuevaNota.parrafo.setText("");
				PanelNuevaNota.parrafo.setForeground(Color.BLACK);
				PanelNuevaNota.pCambiado = true;
			}
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		if(e.getSource() == PanelNuevaNota.titulo){
			
		}
	}

}
