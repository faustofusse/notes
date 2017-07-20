package Notes;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Focus implements FocusListener{

	@Override
	public void focusGained(FocusEvent e) {
		if(e.getSource() == PanelNuevo.titulo){
			if (!PanelNuevo.tCambiado){
				PanelNuevo.titulo.setText("");
				PanelNuevo.titulo.setForeground(Color.BLACK);
				PanelNuevo.tCambiado = true;
			}
		}else{
			if (!PanelNuevo.pCambiado){
				PanelNuevo.parrafo.setText("");
				PanelNuevo.parrafo.setForeground(Color.BLACK);
				PanelNuevo.pCambiado = true;
			}
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		if(e.getSource() == PanelNuevo.titulo){
			
		}
	}

}
