package ten;

public class CircleFromSimpleGeometricObject {
//	extends SimpleGeometricObject;
	private double radius;
	public CircleFromSimpleGeometricObject() {
	}
	public CircleFromSimpleGeometricObject(double radius) {
	this. radius= radius;
	}
	public CircleFromSimpleGeometricObject(double radius,
	String color, boolean filled) {
	this.radius = radius;
	setColor(color);
	setFilled(filled); 
	}
	
	private void setFilled(boolean filled) {
		// TODO Auto-generated method stub
		
	}
	private void setColor(String color) {
		// TODO Auto-generated method stub
		
	}
	/** Return radius */
	public double getRadius() {
	return radius;
	}
	
	/** Set a new radius */
	public void setRadius(double radius) {
	this. radius = radius; 
	}
	
	/** Return area */
	public double getArea() {
	return radius * radius * Math . PI; 
	}
	
	/** Return diameter */
	public double getDiameter() {
	return 2 * radius; 
	}
	
	/** Return perimeter */
	public double getPerimeter() {
	return 2 * radius * Math . PI; 
	}
	
	/** Print the circle info */
	public void printCirclef () {
	System.out.println("The circle is created "+ getDateCreated() +" and the radius is " + radius);

	}
	private String getDateCreated() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getColor() {
		// TODO Auto-generated method stub
		return null;
	}
}