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
public abstract class AbstractFactory {
    public abstract Shape createShape(ShapeType shapeType);
}
