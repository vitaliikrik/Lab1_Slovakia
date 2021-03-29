package kry.edu.factory.implementations;

import kry.edu.module2.polymorphism.interfaces.IGeometry;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  SquareImpl
  @version  1.0.0 
  @since 3/26/2021 - 18.42
*/
public class SquareImpl implements IGeometry {
    private double side;

    public SquareImpl() {
    }

    public SquareImpl(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
