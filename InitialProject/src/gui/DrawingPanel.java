package gui;

import java.awt.Graphics;

import javax.swing.JPanel;

import geometry.Circle;
import geometry.Point;

public class DrawingPanel extends JPanel {

	@Override
	public void paint(Graphics g) {
		// obavezno sper.paint(g)
		super.paint(g);
		Circle circle1 = new Circle(new Point(100,200), 50);
		circle1.draw(g);
	}
	
	
}
