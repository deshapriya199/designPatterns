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
public class FactoryProducer {
    public static AbstractFactory createFactory(FactoryType factoryType){
        switch(factoryType){
            case ROUNDED_SHAPE_FACTORY :
                return new RoundedShapeFactory();
            
            case SHAPE_FACTORY : 
                return new ShapeFactory();
        }
        return null;
    }
}
