package org.howard.edu.lsp.oopfinal.question3;


//Main.java
public class Main {
 public static void main(String[] args) {
     Shape circle = Factory.createShape("circle");
     circle.draw();

     Shape rectangle = Factory.createShape("rectangle");
     rectangle.draw();
 }
}
