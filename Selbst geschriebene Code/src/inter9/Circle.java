package inter9;

public class Circle extends Shape{
	
	protected double raduis = 1.0;

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(double raduis) {
		this.raduis = raduis;
	}
	public Circle(double raduis,String color, boolean filled ) {
		this.raduis = raduis;
	}

	public double getRaduis() {
		return raduis;
	}

	public void setRaduis(double raduis) {
		this.raduis = raduis;
	}

	@Override
	public String toString() {
		return "Circle [raduis=" + raduis + "]";
	}


	
}
