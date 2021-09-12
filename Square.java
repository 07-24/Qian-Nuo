public class Square {
    private double sidelength;
	public Square(double sidelength) {
	    this.sidelength = sidelength;
	}
	public double getSidelength() {
	    return this.sidelength;
	}
	public void setSidelength(double sidelength) {
	    this.sidelength = sidelength;
	}
	public double getArea() {
	    return sidelength*sidelength;
	}
	public double getPerimeter() {
	    return 4*sidelength;
	}
}