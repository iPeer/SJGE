package com.simple.sjge.gui;

import com.simple.sjge.gui.controls.GuiButton;
import com.simple.sjge.util.Debug;

public class TestGui extends Gui {

	@SuppressWarnings("unchecked")
	public TestGui() {
		title = "Test GUI!";
		controls.clear();
		controls.add(new GuiButton(0, 2, 2, "Test Butt'n"));
	}
	
	public void actionPerformed(GuiButton b) {
		if (b.id == 0)
			Debug.p("IT WORK'D!");
	}
	
	public void render() {
		renderBackground();
		drawStringWithShadow(title, 20);
		super.render();
	}
	
	public boolean pausesGame() {
		return true;
	}
	
}
