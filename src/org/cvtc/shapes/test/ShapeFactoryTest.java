package org.cvtc.shapes.test;


import org.cvtc.shapes.ShapeFactory;
import org.cvtc.shapes.ShapeType;
import org.junit.Test;

public class ShapeFactoryTest {


	@Test
	public void testShapeFactoryCuboid() {
		ShapeFactory factory = new ShapeFactory(new MessageBoxSub());
		factory.make(ShapeType.Cuboid);
		
	}
	@Test
	public void testCylinder() {
		ShapeFactory factory = new ShapeFactory(new MessageBoxSub());
		factory.make(ShapeType.Cylinder);
		
	}
	@Test
	public void testSphere() {
		ShapeFactory factory = new ShapeFactory(new MessageBoxSub());
		factory.make(ShapeType.Sphere);
		
	}

}
