package org.cvtc.shapes;

public class ShapeFactory {


		private Dialog dialog;
		
		private Dialog getDialog() {
			
			return dialog;
		}
		
		private void setDialog(Dialog dialog) {
			this.dialog = dialog;
		}
		
		public ShapeFactory(Dialog dialog) {
			setDialog(dialog);
		}
		
		public Shape make(ShapeType type) {
			Shape shape = null;
			switch (type){
				case Cuboid: shape = new Cuboid(getDialog());	
				case Cylinder: shape = new Cylinder(getDialog());
				case Sphere: shape = new Sphere(getDialog());
			}
			return shape;
		}
}
