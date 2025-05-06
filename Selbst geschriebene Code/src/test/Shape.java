package test;

public class Shape {
	
	private Point location;
	protected boolean modifiable;
	private static int numOfInt;
	
	public Shape(Point location, boolean modifiable, int numOfInt) {
		super();
		this.location = location;
		this.modifiable = modifiable;
		this.numOfInt = numOfInt;
	}
	
	public Shape(Point location) {
		
	}
	public Shape (){
		
		
	}
	public Shape(Shape s){
		
	}
	public Point getLocation() {
		return location;
	}
	public void  move(Point p) {
		
	}
	public static int getNumOfInst() {
		return numOfInt;
	}
	public String toStringShape() {
		return " " ;
	}
	protected void finalize() {
		
	}
}
