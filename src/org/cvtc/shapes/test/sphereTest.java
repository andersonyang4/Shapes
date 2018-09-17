package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Sphere;
import org.junit.Test;

public class sphereTest {

	@Test
	public void testSurfaceArea() {
		Sphere sphere1 = new Sphere(5);
		assertEquals(314.16, sphere1.surfaceArea(), 0.1);
	}

	@Test
	public void testVolume() {
		Sphere sphere1 = new Sphere(5);
		assertEquals(523.60, sphere1.volume(), 0.1);
	}

	@Test
	public void testGetRadius() {
		Sphere sphere1 = new Sphere(5);
		assertEquals(5, sphere1.getRadius(), 0.1);
	}
	
	
	//negative dimensions unit test
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeSurfaceArea() {
		Sphere sphere1 = new Sphere(-2);
		sphere1.getRadius();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeVolume() {
		Sphere sphere1 = new Sphere(-1);
		sphere1.getRadius();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeGetRadius() {
		Sphere sphere1 = new Sphere(-1);
		sphere1.getRadius();
	}

}
