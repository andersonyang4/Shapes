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

	//test surface area of cylinder
	@Test
	public void testSurfaceArea() {
		Cylinder cylinder1 = new Cylinder(4, 23);
		assertEquals(678.58, cylinder1.surfaceArea(), 0.1);
		
	}
	
	@Test
	public void testSurfaceArea2() {
		Cylinder cylinder2 = new Cylinder(1, 5);
		assertEquals(37.70, cylinder2.surfaceArea(), 0.1);
		
	}
	
	@Test
	public void testSurfaceAre3() {
		Cylinder cylinder3 = new Cylinder(4, 2);
		assertEquals(150.80, cylinder3.surfaceArea(), 0.1);
		
	}

	//test cylinder volume
	@Test
	public void testVolume() {
		Cylinder cylinder1 = new Cylinder(4, 23);
		assertEquals(1156.11, cylinder1.volume(), 0.1);
	}
	
	@Test
	public void testVolume2() {
		Cylinder cylinder2 = new Cylinder(1, 5);
		assertEquals(15.71, cylinder2.volume(), 0.1);
	}
	
	@Test
	public void testVolume3() {
		Cylinder cylinder3 = new Cylinder(4, 2);
		assertEquals(100.53, cylinder3.volume(), 0.1);
	}

	//test radius of cylinder
	@Test
	public void testGetRadius() {
		Cylinder cylinder1 = new Cylinder(1, 2);
		assertEquals(1, cylinder1.getRadius(), 0.1);
	}

	//test height of cylinder
	@Test
	public void testGetHeight() {
		Cylinder cylinder1 = new Cylinder(1, 2);
		assertEquals(2, cylinder1.getHeight(), 0.1);
	}
	
	
	//test units for negative numbers//
	//If radius has a negative number, the IllegalArgument 
	//exception should be true and throw and error
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeGetRadius() {
	Cylinder cylinder1 = new Cylinder(-1, 2);
	cylinder1.getRadius();
	}
	
	//If height is a negative number, IllegalArgument 
	//exception should be true and throw and error
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeGetHeight() {
	Cylinder cylinder1 = new Cylinder(1, -2);
	cylinder1.getHeight();
	}

}
