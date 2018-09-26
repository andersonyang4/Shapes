package org.cvtc.shapes;
//test 
import java.awt.Component;
import javax.swing.Renderer;

public class Cuboid extends Shape implements Renderer {
	
	//fields
	private float width = 0.0f;
	private float height = 0.0f;
	private float depth = 0.0f;
	
	
	//constructor for Cuboid
	public Cuboid(Dialog messageBox, float width, float height, float depth) {
			super(messageBox);
			setWidth(width);
			setHeight(height);
			setDepth(depth);
			
	} 
	
	
	//Getter for Width
	public float getWidth() {
		return width;
	}

	//Setter for Width
	public void setWidth(float width) {
		//Width can not be less than 0, if so, throw error message
		if (width < 0) {
			throw new IllegalArgumentException("Radius cannot be less than 0.");
		}
		this.width = width;
	}
	//Getter for height
	public float getHeight() {
		return height;
	}

	//Setter for height
	public void setHeight(float height) {
		//Height cannot be less than 0, if so, throw error message
		if (height < 0) {
			throw new IllegalArgumentException("Radius cannot be less than 0.");
		}
		this.height = height;
	}

	//Setter for Depth
	public float getDepth() {
		return depth;
	}
	//Getter for Depth
	public void setDepth(float depth) {
		//Depth can't be less than 0, if so, throw error message
		if (depth < 0) {
			throw new IllegalArgumentException("Radius cannot be less than 0.");
		}
		this.depth = depth;
	}
	
	
	
	@Override
	public float surfaceArea() {
		//formula for Cuboid surface area = 2 (wd + hd + hw) 
		return 2.0f * ((getWidth() * getDepth()) + (getDepth() * getHeight()) + (getHeight() * getWidth()));
	}

	@Override
	public float volume() {
		// formula for Cuboid volume = W * H * D
		return getWidth() * getHeight() * getDepth();
	}

	@Override
	public void render() {
		//message dialog showing Cuboid, width, height, depth, surface area, and volume
		getMessageBox().show("Cuboid" + "\n" + "Width is: " + getWidth() + "\n" + "Height is: " 
				+ getHeight() + "\n" + "Depth is: " + getDepth() + "\n" + "Surface area is: " + surfaceArea() + "\n" 
				+ "Volume is: " + volume(), "Cuboid");
	}


	@Override
	public void setValue(Object aValue, boolean isSelected) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Component getComponent() {
		// TODO Auto-generated method stub
		return null;
	}

}
