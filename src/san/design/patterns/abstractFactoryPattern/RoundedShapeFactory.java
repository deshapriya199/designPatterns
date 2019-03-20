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
public class RoundedShapeFactory extends  AbstractFactory{

    @Override
    public Shape createShape(ShapeType shapeType) {
        switch(shapeType){
           case CIRCLE: 
               return new Circle();
           
           case RECTANGLE : 
               return new RoundedRectangle();
           
           case SQUARE : 
               return new RoundedSquare();
       }
       return null;
    }
    
}
