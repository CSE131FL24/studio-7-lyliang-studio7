package studio7;
import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length=length;
		this.width=width;
	}
	
	public String toString() {
		String stringName="Length="+this.length+"\nWidth="+this.width;
		return stringName;
		
	}
	
	public double calculateArea() {
		double area = length*width;
		return area;
	}

	public boolean isSquare() {
		if (length==width)
			return true;
		else
			return false;
	}
	
	public boolean isBiggerThan(double otherRectangleArea) {
		if(calculateArea()>otherRectangleArea) 
		{
			return true;
		}
		else
			return false;
	}
	
	public void drawRectangle() {
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.rectangle(.5,.5,length,width);

	}
	public static void main(String[]args) {
		Rectangle rectangle1 = new Rectangle(0.25,0.25);
		Rectangle rectangle2 = new Rectangle(0.7,0.9);

		rectangle1.calculateArea();
		rectangle2.isBiggerThan(rectangle1.calculateArea());
		rectangle1.drawRectangle();
		System.out.println(rectangle1);
	}
		
}
