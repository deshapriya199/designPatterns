/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package san.design.patterns.abstractFactoryPattern;

/**
 *
 * @author sdeshapriya
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.createFactory(FactoryType.SHAPE_FACTORY);
        
        Shape circle = shapeFactory.createShape(ShapeType.CIRCLE);
        circle.draw();
        
        Shape square = shapeFactory.createShape(ShapeType.SQUARE);
        square.draw();
        
        Shape rectangle = shapeFactory.createShape(ShapeType.RECTANGLE);
        rectangle.draw();
        
        AbstractFactory roundedFactory = FactoryProducer.createFactory(FactoryType.ROUNDED_SHAPE_FACTORY);
        Shape circle2 = roundedFactory.createShape(ShapeType.CIRCLE);
        circle2.draw();
        
        Shape roundedSquare = roundedFactory.createShape(ShapeType.SQUARE);
        roundedSquare.draw();
        
        Shape roundedRectangle = roundedFactory.createShape(ShapeType.RECTANGLE);
        roundedRectangle.draw();
        
    }
}
