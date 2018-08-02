// demo class to check the test cases for shape class
public class ShapeDemo {

	public static void main(String[] args) {
		
		Shape circle = new Circle(7); //upcasting with Circle Class
		Shape polygon = new Polygon(8); //upcasting with Polygon Class
		Shape rectangle = new Rectangle(3, 4); //upcasting with Rectangle Class
		
		circle.draw();
		polygon.draw();
		rectangle.draw();

	}

}
