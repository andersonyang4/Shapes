package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cuboid;
import org.junit.Test;

public class cuboidTest {
	

	//Test surface area of width, height, and depth
	@Test
	public void testSurfaceArea() {
		Cuboid cuboid1 = new Cuboid(new MessageBoxSub(), 4, 4, 4);
		assertEquals(96.0, cuboid1.surfaceArea(), 0.01);
	}
	@Test
	public void testSurfaceArea2() {
		Cuboid cuboid2 = new Cuboid(new MessageBoxSub(), 4, 12, 15);
		assertEquals(576.0, cuboid2.surfaceArea(), 0.01);
	}
	@Test
	public void testSurfaceArea3() {
		Cuboid cuboid3 = new Cuboid(new MessageBoxSub(), 2, 4, 6);
		assertEquals(88.0, cuboid3.surfaceArea(), 0.01);
	}

	//test volume area of cuboid
	@Test
	public void testVolume() {
		Cuboid cuboid1 = new Cuboid(new MessageBoxSub(), 4, 4, 4);
		assertEquals(64.0, cuboid1.volume(), 0.01);
	}
	@Test
	public void testVolume2() {
		Cuboid cuboid2 = new Cuboid(new MessageBoxSub(), 4, 12, 15);
		assertEquals(720.0, cuboid2.volume(), 0.01);
	}
	@Test
	public void testVolume3() {
		Cuboid cuboid3 = new Cuboid(new MessageBoxSub(), 2, 4, 6);
		assertEquals(48.0, cuboid3.volume(), 0.01);
	}

	//test width of cuboid
	@Test
	public void testGetWidth() {
		Cuboid cuboid1 = new Cuboid(new MessageBoxSub(), 1, 2, 3);
		assertEquals(1, cuboid1.getWidth(), 0.01);
	}

	//test height of cuboid
	@Test
	public void testGetHeight() {
		Cuboid cuboid1 = new Cuboid(new MessageBoxSub(), 1, 2, 3);
		assertEquals(2, cuboid1.getHeight(), 0.01);
	}

	//test depth of cuboid
	@Test
	public void testGetDepth() {
		Cuboid cuboid1 = new Cuboid(new MessageBoxSub(), 1, 2, 3);
		assertEquals(3, cuboid1.getDepth(), 0.01);
	}
	
	
	//test negative numbers with exception error
	//If Width has a negative number, the IllegalArgument 
		//exception should be true and throw and error
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeWidth() {
		Cuboid cuboid1 = new Cuboid(new MessageBoxSub(), -1, 1, 1);
		cuboid1.getWidth();
	}
	
	//If Height has a negative number, the IllegalArgument 
		//exception should be true and throw and error
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeHeight() {
		Cuboid cuboid1 = new Cuboid(new MessageBoxSub(), 1, -1, 1);
		cuboid1.getWidth();
	}
	
	//If Depth has a negative number, the IllegalArgument 
		//exception should be true and throw and error
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeDepth() {
		Cuboid cuboid1 = new Cuboid(new MessageBoxSub(), 1, 1, -1);
		cuboid1.getWidth();
	}

}
