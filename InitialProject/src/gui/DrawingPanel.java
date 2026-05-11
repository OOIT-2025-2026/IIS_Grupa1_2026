package gui;

import java.awt.Graphics;

import javax.swing.JPanel;

import geometry.Circle;
import geometry.Donut;
import geometry.Point;
import geometry.Shape;

public class DrawingPanel extends JPanel {
	public DrawingPanel() {
	}

	@Override
	public void paint(Graphics g) {
		// obavezno sper.paint(g)
		super.paint(g);
		Circle circle1 = new Circle(new Point(100,200), 50);
		circle1.draw(g);
		
		Shape shape1 = new Circle(new Point(100,200), 150);
		System.out.println(shape1.toString());
		shape1.draw(g);
		System.out.println(((Circle)shape1).area());
		
		Point point1 = new Point(250,350);
		point1.draw(g);
		point1.moveBy(50, 50);
		point1.draw(g);
		
		Donut donut1 = new Donut(new Point(400,500), 50, 40);
		Donut donut2 = new Donut(new Point(400,500), 60, 40);
		donut1.compareTo(donut2);
	}
	
	
}
