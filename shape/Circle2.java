package shape;
public class Circle2 extends Shape {
    private double radius;
	public double getRadius() { return radius; }
	public void setRadius(double radius) { this.radius = radius; }
	public Circle2(double radius) { this.radius = radius; }
	public double getArea() {
	    int N = 100000;
		int sum = 0;
		double x,y;
		for(int i = 0;i<N;i++) {
		    x = Math.random();
			y = Math.random();
			if((x*x+y*y)<(radius*radius))
			    sum++;
		}
		return 4*sum/N;
	}