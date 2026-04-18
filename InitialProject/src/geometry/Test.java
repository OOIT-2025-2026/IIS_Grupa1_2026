package geometry;

public class Test {

	public static void main(String[] args) {
		Point p = new Point();
		p.setX(10);
		p.setY(20);
		p.setSelected(true);

		System.out.println("Koordinata x: " + p.getX());
		System.out.println("Koordinata y: " + p.getY());
		System.out.println("Selected: " + p.isSelected());

		Point point2 = new Point();
		point2.setX(50);
		point2.setY(40);
		double distance = p.distance(point2);
		System.out.println("Distanca je: " + distance);

		/* Vezbe 2 - zadacici */

		// 1. Promeniti vrednost x koordinate tacke p
		// na vrednost y koordinate tacke point2
		System.out.println("Koordinata x p: " + p.getX());
		p.setX(point2.getY());
		System.out.println("Koordinata y point2: " + point2.getY());
		System.out.println("Koordinata x p: " + p.getX());
		
		//promeni y koordinatu tacke point2 na 50
		point2.setY(50);
		System.out.println("Koordinata y point2: " + point2.getY());
		System.out.println("Koordinata x p: " + p.getX());
		// prenos po vrednosti

		// 2. Postaviti za pocetnu tacku linije l1 tacku p, a
		// za krajnju tacku linije l1 tacku p1
		Line l1 = new Line();
		l1.setStartPoint(p); // po defaultu start point je null
		System.out.println("Koordinata x p: " + p.getX());
		System.out.println("Koordinata y p: " + p.getY());
		System.out.println("Koordinata x pocetne tacke l1: " + l1.getStartPoint().getX());
		System.out.println("Koordinata y pocetne tacke l1: " + l1.getStartPoint().getY());
		//prenos po referenci



		// 3. Postaviti y koordinatu krajnje tacke l1 na 23
		// l1.getEndPoint().setY(23); - puca zbog NullPointerException
		// da ne bi bilo NullPointerException-a
		Point endPoint = new Point();
		l1.setEndPoint(endPoint);
		System.out.println("Koordinata y krajnje tacke l1: " + l1.getEndPoint().getY());
		l1.getEndPoint().setY(23);
		System.out.println("Koordinata y krajnje tacke l1: " + l1.getEndPoint().getY());


		// 4. Promeniti vrednost x koordinate pocetne tacke linije l1
		// na vrednost y koordinate krajnje tacke linije l1
		l1.getStartPoint().setX(l1.getEndPoint().getY());


		// 5. Postaviti x koordinatu krajnje tacke l1 na vrednost
		// duzine linije l1 umanjene za vrednost zbira x i y
		// koordinate pocetne tacke linije l1
		l1.getEndPoint().setX((int)(l1.lenght() - (l1.getStartPoint().getX() + l1.getStartPoint().getY())));


		// 6. Postaviti x koordinatu tacke gore levo pravougaonika
		// r1 na vrednost 10 i y koordinatu na vrednost 15


		// 7. Postaviti centar kruga c1 na koordinate tacke
		// gore levo od r1


		// 8. Postaviti x koordinatu centra kruga c1 na vrednost razlike
		// povrsine pravougaonika r1 i y koordinate pocetne tacke linije l1

		//Vezbe 5
		
		/*
		 * Postaviti x koordinatu centra ranije kreiranog kruga circle1 
		 * na vrednost zbira vrednosti poluprečnika kruga circle1 i 
		 * vrednosti koja predstavlja udaljenost početne i krajnje tačke 
		 * prethodno kreirane linije line1 (koristiti metodu distance(),
		 *  a ne length()). 
		 */
		Circle c = new Circle();
		c.setCenter(new Point());
		c.setRadius(10);
		c.getCenter().setX((int)(c.getRadius()+l1.getStartPoint().distance(l1.getEndPoint())));
	
		Point p3 = new Point(10, 20);
		p3.setSelected(true);
		
		Point p4 = new Point(10,20,true);
		System.out.println(p3.toString());
		
		System.out.println(p3.equals(p4));
		System.out.println(p3==p4);
		
		p3 = p4;
		
		System.out.println(p3==p4);

	}

}
