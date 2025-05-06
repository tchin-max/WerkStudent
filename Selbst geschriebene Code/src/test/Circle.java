package test;

public class Circle extends Shape{
	
	public static float PI = 3.14159f;
	private static final float DEFAULT_RADUIS = 1f;
	private float r;
	public float getR() {
		return r;
	}
	public void setR(float r) {
		this.r = r;
	}
	public Circle(Point location ,float r, boolean modifiable) {
		
		this.r = r;
	}
public Circle(Point loc , float r) {
	
}
public Circle(float r) {
	
}
public Circle() {
	
}
public Circle(Circle c) {
	
}
public float area() {
	return (r*r)*PI;
}
public float circumference() {
	return 2*PI*r;
}
public String toStringCircle(){
	return " ";
}
}
