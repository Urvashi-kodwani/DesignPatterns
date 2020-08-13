/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratordesignpattern;

/**
 *
 * @author Lenovo
 */

interface Shape{
   void draw();
}

class Rectangle implements Shape{
    public void draw(){
        System.out.println("Shape: Rectangle");
    }
}

class Circle implements Shape{
    public void draw(){
        System.out.println("Shape: Circle");
     }
}

abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }
    
    public void draw(){
        decoratedShape.draw();
    }
}

class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratedShape ){
        super(decoratedShape);
    }
    
    public void draw(){
        decoratedShape.draw();
        setRedBorder(decoratedShape);
      }
    
    private void setRedBorder(Shape decoratedshape){
        System.out.println("Border : Red");
    }
}

class GreenShapeDecorator extends ShapeDecorator{
    public GreenShapeDecorator(Shape decoratedShape ){
        super(decoratedShape);
    }
    
    public void draw(){
        decoratedShape.draw();
        setGreenBorder(decoratedShape);
      }
    
    private void setGreenBorder(Shape decoratedshape){
        System.out.println("Border : Green");
    }
}
public class DecoratorDesignPattern {
    public static void main(String[] args) {
        Shape circle=new Circle();
        Shape redCircle=new RedShapeDecorator((new Circle()));
        Shape greenCircle=new GreenShapeDecorator(new Circle());
        
        Shape rectangle=new Rectangle();
        Shape redRectangle=new RedShapeDecorator(new Rectangle());
        Shape greenRectangle=new GreenShapeDecorator(rectangle);
        
        circle.draw();
        redCircle.draw();
        greenCircle.draw();
        
        rectangle.draw();
        redRectangle.draw();
        greenRectangle.draw();
    }
}
