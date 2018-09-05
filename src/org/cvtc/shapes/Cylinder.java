package org.cvtc.shapes;

import javax.swing.JOptionPane;

public class Cylinder extends Shape {

	//fields 
	private float radius = 0.0f;
	private float height = 0.0f;
	
	//get Radius 
	public float getRadius() {
		return radius;
	}
	//setter for radius
	public void setRadius(float radius) {
		//radius can not be less than 0, if so, throw error message
		if (radius < 0) {
			throw new IllegalArgumentException("Radius cannot be less than 0.");
		}
		this.radius = radius;
	}
	
	//Getter for Height
	public float getHeight() {
		return height;
	}
	//Setter for Height
	public void setHeight(float height) {
		//Height can not be less than 0, if so, throw error message
		if (height < 0) {
			throw new IllegalArgumentException("Height cannot be less than 0.");
		}
		this.height = height;
	}
	
	//Cylinder constructor and passing in value of radius and height
	public Cylinder(float radius, float height) {
		setRadius(radius);
		setHeight(height);
	}
	
	
	
	@Override
	public float surfaceArea() {
		//Surface area for cylinder = 2πrh+2πr2
		return (2.0f * (float)Math.PI * (float)Math.pow(getRadius(), 2)) + (2.0f * (float)Math.PI * getRadius() * getHeight());
	}

	@Override
	public float volume() {
		// Volume for cylinder = PI * R^2 * H
		return (float)Math.PI * (float)Math.pow(getRadius(), 2) * getHeight();
	}

	@Override
	public void render() {
		////message dialog showing Cylinder, width, height, depth, surface area, and volume
		JOptionPane.showMessageDialog(null, "Cylinder" + "\n" + "Radius is: " + getRadius() + "\n" 
				+ "Height is: " + getHeight() + "\n" + "Surface area is: " + surfaceArea() + "\n" 
				+ "Volume is: " + volume());
	}

	

	
	
	

}