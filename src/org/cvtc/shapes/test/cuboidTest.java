package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cuboid;
import org.junit.Test;

public class cuboidTest {

	@Test
	public void testSurfaceArea() {
		Cuboid cuboid1 = new Cuboid(4, 4, 4);
		assertEquals(96.0, cuboid1.surfaceArea(), 0.01);
	}

	@Test
	public void testVolume() {
		Cuboid cuboid1 = new Cuboid(4, 4, 4);
		assertEquals(64.0, cuboid1.volume(), 0.01);
	}

	@Test
	public void testGetWidth() {
		Cuboid cuboid1 = new Cuboid(1, 2, 3);
		assertEquals(1, cuboid1.getWidth(), 0.01);
	}

	@Test
	public void testGetHeight() {
		Cuboid cuboid1 = new Cuboid(1, 2, 3);
		assertEquals(2, cuboid1.getHeight(), 0.01);
	}

	@Test
	public void testGetDepth() {
		Cuboid cuboid1 = new Cuboid(1, 2, 3);
		assertEquals(3, cuboid1.getDepth(), 0.01);
	}
	
	
	//test negative numbers with exception error
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeWidth() {
		Cuboid cuboid1 = new Cuboid(-1, 1, 1);
		cuboid1.getWidth();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeHeight() {
		Cuboid cuboid1 = new Cuboid(1, -1, 1);
		cuboid1.getWidth();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeDepth() {
		Cuboid cuboid1 = new Cuboid(1, 1, -1);
		cuboid1.getWidth();
	}

}
