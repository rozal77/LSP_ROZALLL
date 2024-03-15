package org.howard.edu.lsp.midterm.question1;

public class Driver {

	public static void main(String[] args) {
		// Object from SecurityOps class to test the encrypt functionality
		SecurityOps testObject = new SecurityOps();
		String confirm = "IoeSI6lvCC33";
		if(testObject.encrypt("I love CSCI363").equals(confirm)){
			System.out.println("test Pass");
		}
		else {
			System.out.println("failed");
		}

	}

}
