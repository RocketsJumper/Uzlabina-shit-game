package main;

import javax.swing.JPanel;
import javax.swing.ImageIcon;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;

public class Game extends JPanel{
	Image bg = null;
	
	public Game(){
		MediaTracker mt = new MediaTracker(this);
		bg = new ImageIcon(this.getClass().getResource("/bg.jpg")).getImage();
		mt.addImage(bg, 0);
		try {
			mt.waitForAll();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		int imwidth = bg.getWidth(null);
		int imheight = bg.getHeight(null);
		graphics.drawImage(bg, 1, 1, null);
	}
}
