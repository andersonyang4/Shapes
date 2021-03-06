package org.cvtc.shapes;


public class Sphere extends Shape implements Renderer{

	//fields
	private float radius = 0.0f;
	
	//getter for Radius
	public float getRadius() {
		
		return radius;
	}

	//setter for Radius 
	public void setRadius(float radius) {
		//Width can not be less than 0, if so, throw error message
		if (radius < 0) {
			throw new IllegalArgumentException("Radius cannot be less than 0.");
		}
		this.radius = radius;
	}
	
	//Sphere constructor and passing in radius
	public Sphere(Dialog messageBox, float radius) {
		super(messageBox);
		setRadius(radius);
	}
	
	
	public Sphere(Dialog dialog) {
		super(dialog);
	}

	@Override
	public float surfaceArea() {
		//Sphere surface area = 4πr2
		return 4.0f * (float)Math.PI * (float)Math.pow(getRadius(), 2);
		
	}
	
	@Override
	public float volume() {
		//Sphere volume = (4/3) * πR^3
		return (4.0f / 3.0f) * (float)Math.PI * (float)Math.pow(getRadius(), 3);
	}
	
	@Override
	public void render() {
		//message dialog showing Sphere, width, height, depth, surface area, and volume
		getMessageBox().show("Sphere" + "\n" + "Radius: " + getRadius() + "\n" + "Surface area is: " + surfaceArea() + "\n" 
	+ "Volume is: " + volume(), "Sphere");
	}
	
	
	
}
