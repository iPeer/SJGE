package com.simple.sjge.engine;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import com.simple.sjge.gui.Gui;
import com.simple.sjge.gui.controls.GuiButton;

public class iMouseMotionListener implements MouseMotionListener {

	protected Engine engine;
	
	public iMouseMotionListener(Engine engine) {
		this.engine = engine;
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void mouseMoved(MouseEvent e) {
			int i = e.getX();
			int j = e.getY();
			Gui gui = engine.currentGui;
			if (gui != null) { 
				ArrayList controls = gui.controls;
				for (int l = 0; l < controls.size(); l++) {
					GuiButton button = (GuiButton)controls.get(l);
					if (button.enabled && i > button.x && i < (button.x + button.w) && j > button.y && j < (button.y + button.h)) {
						button.isMouseOver = true;
					}
					else {
						button.isMouseOver = false;
					}
				}
			}
		}

}
