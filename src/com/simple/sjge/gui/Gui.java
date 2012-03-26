package com.simple.sjge.gui;

import java.awt.AlphaComposite;
import java.awt.Font;
import java.awt.Graphics2D;
import java.util.ArrayList;

import com.simple.sjge.engine.Engine;
import com.simple.sjge.gfx.Colour;
import com.simple.sjge.gui.controls.GuiButton;

@SuppressWarnings("rawtypes")
public class Gui {

	protected Engine engine;
	public ArrayList controls;
	public String title;
	
	public Gui() {
		controls = new ArrayList();
		title = "Some GUI";
		this.engine = Engine.getInstance();
	}
	
	public void render() {
		for (int c = 0; c < controls.size(); c++) {
			((Gui)controls.get(c)).render();
		}
	}
	
	public void tick() { 
		for (int c = 0; c < controls.size(); c++) {
			((Gui)controls.get(c)).tick();
		}
	}
	
	public void drawStringWithShadow(String s, int x, int y) {
		drawStringWithShadow(s, x, y, 14);
	}
	
	public void drawStringWithShadow(String s, int y) {
		Graphics2D g = Engine.getGraphicsInstance();
		int x = (engine.getWidth() - g.getFontMetrics().stringWidth(s)) / 2;
		drawStringWithShadow(s, x, y, 14);
	}

	public void drawStringWithShadow(String s, int x, int y, int h) {
		Graphics2D g = Engine.getGraphicsInstance();

		Font f = g.getFont();
		g.setFont(new Font(g.getFont().getFontName(), Font.BOLD, h));

		g.setColor(Colour.BLACK);
		g.drawString(s, x+2, y+2);
		g.setColor(Colour.WHITE);
		g.drawString(s, x, y);
		g.setFont(f);
	}
	
	public void renderBackground() {
		Graphics2D g = Engine.getGraphicsInstance();
		g.setColor(Colour.BLACK);
		g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.7f));
		g.fillRect(0, 0, engine.getWidth(), engine.getHeight());
		g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));
	}

	public void actionPerformed(GuiButton button) {
		
	}

	public void actionPerformedRight(GuiButton button) {

	}
	
}
