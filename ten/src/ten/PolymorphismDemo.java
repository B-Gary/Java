package ten;

public class PolymorphismDemo {
	/** Main method */ 
	public static void main(String[] args){ 
		// Display circle and rectangle properties

		displayObject(new CircleFromSimpleGeometricObject(1, "red",false)); 
		displayObject(new RectangleFromSimpleGeometricObject(1, 1,"black", true)); 
	}
		
		 private static void displayObject(CircleFromSimpleGeometricObject circleFromSimpleGeometricObject) {
		// TODO Auto-generated method stub
		
	}

		/** Display geometric object properties */
		public static void displayObject(SimpleGeometricObject object){
		System.out.println("Created on "+ object.getDateCreated() +" Color is " + object.getColor());
	}
}
