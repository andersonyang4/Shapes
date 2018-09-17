package org.cvtc.shapes;

public class ShapesTest {

	public ShapesTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main (String[] args) {
		
		//Creating an instance of cuboid, cylinder, and sphere giving it static values
		Cuboid cuboid = new Cuboid(4, 12, 15);
		Cylinder cylinder = new Cylinder (4, 12);
		Sphere sphere = new Sphere(5);
		
		//Render message to show shapes dimensions, surface area, and volume
		cuboid.render();
		cylinder.render();
		sphere.render();
		
	}

}
