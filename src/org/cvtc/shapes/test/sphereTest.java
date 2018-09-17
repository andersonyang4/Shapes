package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Sphere;
import org.junit.Test;

public class sphereTest {

	//Test to see if Sphere with radius of 5 equals Surface Area 314.16
	@Test
	public void testSurfaceArea() {
		Sphere sphere1 = new Sphere(5);
		assertEquals(314.16, sphere1.surfaceArea(), 0.1);
	}
	
	//Test to see if Sphere with radius of 10 equals Surface Area 1256.64
	@Test
	public void testSurfaceArea2() {
		Sphere sphere2 = new Sphere(10);
		assertEquals(1256.64, sphere2.surfaceArea(), 0.1);
	}
	
	//Test to see if Sphere with radius of 1 equals Surface Area 12.57
	@Test
	public void testSurfaceArea3() {
		Sphere sphere3 = new Sphere(1);
		assertEquals(12.57, sphere3.surfaceArea(), 0.1);
	}
	
	//Test to see if Sphere with radius of 5 equals Volume 523.60
	@Test
	public void testVolume() {
		Sphere sphere1 = new Sphere(5);
		assertEquals(523.60, sphere1.volume(), 0.1);
	}
	
	//Test to see if Sphere with radius of 10 equals Volume 4188.79
	@Test
	public void testVolume2() {
		Sphere sphere2 = new Sphere(10);
		assertEquals(4188.79, sphere2.volume(), 0.1);
	}
	
	//Test to see if Sphere with radius of 1 equals Volume 4.19
	@Test
	public void testVolume3() {
		Sphere sphere3 = new Sphere(1);
		assertEquals(4.19, sphere3.volume(), 0.1);
	}
	
	//Test to see if Sphere with radius of 5 equals 5
	@Test
	public void testGetRadius() {
		Sphere sphere1 = new Sphere(5);
		assertEquals(5, sphere1.getRadius(), 0.1);
	}
	
	
	//negative dimensions unit test
	//If radius has a negative number, the IllegalArgument 
		//exception should be true and throw and error
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeGetRadius() {
		Sphere sphere1 = new Sphere(-1);
		sphere1.getRadius();
	}

}
