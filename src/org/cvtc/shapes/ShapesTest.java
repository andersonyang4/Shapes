package org.cvtc.shapes;

public class ShapesTest {

	public ShapesTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main (String[] args) {
		
		//Creating an instance of cuboid, cylinder, and sphere giving it static values
		Cuboid cuboid = new Cuboid(new MessageBox(), 2, 4, 6);
		Cylinder cylinder = new Cylinder (new MessageBox(), 4, 2);
		Sphere sphere = new Sphere(new MessageBox(), 5);
		
		//Render message to show shapes dimensions, surface area, and volume
		cuboid.render();
		cylinder.render();
		sphere.render();
		
	}

}
