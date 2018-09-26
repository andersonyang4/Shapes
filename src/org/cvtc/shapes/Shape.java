package org.cvtc.shapes;

public abstract class Shape {

	private Dialog messageBox;
	
	public Shape(Dialog messageBox) {
		setMessageBox(messageBox);
	}
	
	protected Dialog getMessageBox() {
		return this.messageBox;
	}
	
	private void setMessageBox(Dialog messageBox) {
		
		this.messageBox = messageBox;
	}
	
	
	
	public abstract float surfaceArea();
	
	public abstract float volume();
	
	public abstract void render();
	
}
