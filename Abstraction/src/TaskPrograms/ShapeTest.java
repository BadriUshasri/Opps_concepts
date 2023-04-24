package TaskPrograms;

public class ShapeTest {

	public static void main(String[] args) {
		System.out.println("Before update ----------------");
		Cylinder cylinder = new Cylinder(30.00, 70.00);
		System.out.println("AREA OF Cylinder: " + cylinder.area());
		System.out.println("AREA OF Cylinder after a round value: " + Math.round(cylinder.area()));
		System.out.println("Volume OF Cylinder: " + cylinder.volume());
		System.out.println("Volume OF Cylinder after a round value: " + Math.round(cylinder.volume()));
		System.out.println("Height OF Cylinder: " + cylinder.getHeight());
		System.out.println("radius OF Cylinder: " + cylinder.getRadius());
		cylinder.setRadius(70.00);
		cylinder.setHeight(80.00);
		System.out.println("Afeter update ----------------");
		System.out.println("AREA OF Cylinder: " + cylinder.area());
		System.out.println("AREA OF Cylinder after a round value: " + Math.round(cylinder.area()));
		System.out.println("Volume OF Cylinder: " + cylinder.volume());
		System.out.println("Volume OF Cylinder after a round value: " + Math.round(cylinder.volume()));
		System.out.println("Height OF Cylinder: " + cylinder.getHeight());
		System.out.println("radius OF Cylinder: " + cylinder.getRadius());

		System.out.println("sphere test---------------");
		Sphere sphere = new Sphere(45.00);
		System.out.println("AREA OF sphere: " + sphere.area());
		System.out.println("AREA OF sphere after a round value: " + Math.round(sphere.area()));
		System.out.println("Volume OF sphere: " + sphere.volume());
		System.out.println("Volume OF sphere after a round value: " + Math.round(sphere.volume()));
		System.out.println("radius OF sphere: " + sphere.getRadius());

	}

}


