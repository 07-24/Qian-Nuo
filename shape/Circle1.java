package shape;
public class Circle1 extends Shape {
    private double radius;
	public double getRadius() { return radius; }
	public void setRadius(double radius) { this.radius = radius; }
	public Circle1(double radius) {this.radius =radius; }
	public double getArea() {
	    return Math.PI*radius*radius;
	}
}