package TaskPrograms;

public class Cylinder extends Shape {
	double height;
	public Cylinder(double radius,double height) {
		super(radius);
		this.height=height;
		
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return  2*Math.PI*super.getRadius()*this.height+2*Math.PI*Math.pow(super.getRadius(), 2);
	}
     @Override
    public double volume() {
    	// TODO Auto-generated method stub
    	return Math.PI*Math.pow(super.getRadius(), 2)*this.height;
    }
     
     public double getHeight() {
    	 return height;
     }
     public void setHeight(double height) {
    	 this.height = height;
     }
}
