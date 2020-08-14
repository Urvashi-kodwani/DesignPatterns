/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadedesignpattern;

/**
 *
 * @author Lenovo
 */

interface Shape{
    public void draw();
}

class Circle implements Shape{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape{
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}

class Square implements Shape{
    public void draw(){
        System.out.println("Drawing Square");
    }
}

class ShapeMaker{
    private Shape circle;
    private Shape square;
    private Shape rectangle;

    public ShapeMaker() {
       circle= new Circle();
       square=new Square();
       rectangle=new Rectangle();
    }
    
    public void drawCircle(){
        circle.draw();
    }
    
    public void drawSquare(){
        square.draw();
    }
    
    public void drawRectangle(){
        rectangle.draw();
    }
}
public class FacadeDesignPattern {
    public static void main(String[] args) {
      ShapeMaker shapeMaker = new ShapeMaker();

      shapeMaker.drawCircle();
      shapeMaker.drawRectangle();
      shapeMaker.drawSquare();
    }
}
