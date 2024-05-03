package org.howard.edu.lsp.oopfinal.question3;

public class Factory {
		 public static Shape createShape(String shapeType) {
		     if (shapeType.equalsIgnoreCase("circle")) {
		         return new Circle();
		     } else if (shapeType.equalsIgnoreCase("rectangle")) {
		         return new Rectangle();
		     }
		     // if user requests object creation for any other shape, throws an exception.
		     throw new IllegalArgumentException("Invalid shape type: " + shapeType);
		 }
		}
