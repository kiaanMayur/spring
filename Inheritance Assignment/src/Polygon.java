public class Polygon extends Shape { //class Polygon inherits class Shape
	
	private int totalSides;
	
	public Polygon(int totalSides) {
		this.totalSides = totalSides;
	}
	
	//overriding method
	@Override
	public void draw() {
		
		System.out.println("A polygon with sides " + totalSides);
		
	}
}
