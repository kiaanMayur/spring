public class Rectangle extends Shape { //class Rectangle inherits class Shape
	
	private int length;
	private int breadth;
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		
	}
	
	@Override
	public void draw() {
		
		System.out.println("A rectangle with sides " + length + " " + breadth);
		
	}
}
