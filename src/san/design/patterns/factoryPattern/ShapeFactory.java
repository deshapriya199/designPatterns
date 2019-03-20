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
public class ShapeFactory {
   public static Shape createShape(ShapeType shapeType){
       switch(shapeType){
           case CIRCLE: 
               return new Circle();
           
           case RECTANGLE : 
               return new Rectangle();
           
           case SQUARE : 
               return new Square();
       }
       return null;
   } 
}
