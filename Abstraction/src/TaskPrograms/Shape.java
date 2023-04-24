package TaskPrograms;

public  abstract class Shape {
	double radius;
	public Shape(double radius) {
		this.radius= radius;
	
	}
	public double getRadius() {
		return radius;
		
	}
	public void setRadius(double ra) {
		if(ra==0.0) {
			System.out.println("please enter a radius");
		}
		 radius = ra;
		
	}
	 public abstract double area();
	 public abstract double volume();
	 

}
