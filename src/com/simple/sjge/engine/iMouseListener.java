package com.simple.sjge.engine;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import com.simple.sjge.gui.Gui;
import com.simple.sjge.gui.controls.GuiButton;

public class iMouseListener implements MouseListener {
	
	protected Engine engine;

	public iMouseListener(Engine engine) {
		this.engine = engine;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int i = e.getX();
		int j = e.getY();
		Gui gui = engine.currentGui;
		if (gui != null) { 
			ArrayList controls = gui.controls;
			for (int l = 0; l < controls.size(); l++) {
				GuiButton button = (GuiButton)controls.get(l);
				if (button.mousePressed(i, j))
					if (e.getButton() == 3)
						button.actionPerformedRight(button); // [Roxy] Enables the button to take right click input
					else
						button.actionPerformed(button);
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		

	}

}
