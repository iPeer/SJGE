package com.simple.sjge.gui.controls;

import java.awt.FontMetrics;
import java.awt.Graphics2D;

import com.simple.sjge.engine.Engine;
import com.simple.sjge.gfx.Colour;
import com.simple.sjge.gui.Gui;

public class GuiButton extends Gui {

	public int NORMAL_COLOUR = 0xff0000;
	public int HOVER_COLOUR = 0x0000ff;
	public String text;
	public int x, y, w, h, id;
	public boolean enabled = true;
	public boolean isMouseOver = false;
	private boolean beenPressed = false;

	public GuiButton(int id, int x, int y, String text) {
		this(id, x, y, 200, 30, text);
	}

	public GuiButton(int id, int x, int y, int w, int h, String text) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.text = text;
	}

	public void tick() {
		super.tick();
	}

	public void render() {
		Graphics2D g = Engine.getGraphicsInstance();
		Colour c = new Colour(NORMAL_COLOUR);
		if (isMouseOver())
			c = new Colour(HOVER_COLOUR);
		g.setColor(c);
		g.fill3DRect(this.x, this.x, this.w, this.h, enabled);
		g.setColor(Colour.BLACK);
		FontMetrics fm = g.getFontMetrics();
		int a = fm.stringWidth(this.text);
		drawStringWithShadow(this.text, (this.x + (this.w - a) / 2), (this.y + (9 + this.h) / 2), fm.getFont().getSize());
	}

	public boolean mousePressed(int x, int y) {
		beenPressed = true;
		return enabled && x > this.x && x < (this.x + this.w) && y < (this.y + this.h) && y > this.y;
	}

	public boolean isMouseOver() {
		return isMouseOver;
	}

}
