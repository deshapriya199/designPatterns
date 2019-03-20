/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package san.design.patterns.factoryPattern;

/**
 *
 * @author sdeshapriya
 */
public class Main {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.createShape(ShapeType.CIRCLE);
        circle.draw();
        
        Shape square = ShapeFactory.createShape(ShapeType.SQUARE);
        square.draw();
        
        Shape rectangle = ShapeFactory.createShape(ShapeType.RECTANGLE);
        rectangle.draw();
    }
}
