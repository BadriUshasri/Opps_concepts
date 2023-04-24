package TaskPrograms;

public class Sphere extends Shape {
	public Sphere(double radius) {
		super(radius);
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 4*Math.PI*Math.pow(super.getRadius(), 2);
	}
	
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return (4/3)*Math.PI*Math.pow(super.getRadius(), 3);
	}

}
