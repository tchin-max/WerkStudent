package inter9;

public class Rectangle extends Shape{
	protected double width = 1.0;
	protected double length = 1.0;
	
public Rectangle() {}
 
	public Rectangle(String color, boolean filled) {
	super(color, filled);
}
	




	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	public double getArea() {

		return 0;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
