/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorydesignpattern;

/**
 *
 * @author Urvashi
 */

class Point{
    private double x;
    private double y;

    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    static class Factory{
        public static Point cartesianPoints(double x,double y){
            return new Point(x,y);
        }
        
        public static Point polarPoints(double rho,double theta){
            return new Point(rho*Math.cos(theta),rho*Math.sin(theta));
        }
    }
    
}
public class FactoryDesignPattern {

    public static void main(String[] args) {
        Point p1=Point.Factory.cartesianPoints(2.0, 3.0);
        Point p2=Point.Factory.polarPoints(0.3,0.7);
    }
    
}
