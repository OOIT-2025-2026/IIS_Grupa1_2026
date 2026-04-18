package geometry;

public class Point {

	private int x;
	private int y;
	private boolean selected;

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(int x, int y, boolean selected) {
		/*
		 * this.x = x; this.y = y;
		 */
		this(x, y);
		this.selected = selected;
	}

	public double distance(Point point2) {
		double a = this.x - point2.x;
		double b = this.y - point2.y;
		double c = Math.sqrt(a * a + b * b);
		return c;
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point secondPoint = (Point) obj;
			if(this.x == secondPoint.x && this.y == secondPoint.y) {
				return true;
			}
		}
		return false;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

}