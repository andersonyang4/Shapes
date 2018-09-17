/**
 * 
 */
package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cylinder;
import org.junit.Test;

/**
 * @author andersonyang
 *
 */
public class cylinderTest {


	@Test
	public void testSurfaceArea() {
		Cylinder cylinder1 = new Cylinder(4, 23);
		assertEquals(678.58, cylinder1.surfaceArea(), 0.1);
		
	}

	
	@Test
	public void testVolume() {
		Cylinder cylinder1 = new Cylinder(4, 23);
		assertEquals(1156.11, cylinder1.volume(), 0.1);
	}

	
	@Test
	public void testGetRadius() {
		Cylinder cylinder1 = new Cylinder(1, 2);
		assertEquals(1, cylinder1.getRadius(), 0.1);
	}

	
	@Test
	public void testGetHeight() {
		Cylinder cylinder1 = new Cylinder(1, 2);
		assertEquals(2, cylinder1.getHeight(), 0.1);
	}
	
	
	//test unit for negative numbers 
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeSurfaceArea() {
	Cylinder cylinder1 = new Cylinder(-1, -2);
	cylinder1.surfaceArea();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeVolume() {
	Cylinder cylinder1 = new Cylinder(-1, -2);
	cylinder1.volume();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeGetRadius() {
	Cylinder cylinder1 = new Cylinder(-1, -2);
	cylinder1.getRadius();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeGetHeight() {
	Cylinder cylinder1 = new Cylinder(-1, -2);
	cylinder1.getHeight();
	}

}
