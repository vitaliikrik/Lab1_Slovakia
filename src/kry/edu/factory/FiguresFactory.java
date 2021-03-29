package kry.edu.factory;

import kry.edu.factory.implementations.RectangleImpl;
import kry.edu.factory.implementations.RoundImpl;
import kry.edu.factory.implementations.SquareImpl;
import kry.edu.module2.polymorphism.interfaces.IGeometry;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  FiguresFactory
  @version  1.0.0 
  @since 3/26/2021 - 18.23
*/
public class FiguresFactory {
    public static IGeometry create(int length, int width) {
        if (length == width) {
            return new SquareImpl(length);
        }
        return new RectangleImpl(length, width);
    }

    public static IGeometry create(double a, Figures figure) {
        if (figure.equals(Figures.ROUND)) return new RoundImpl(a);
        if (figure.equals(Figures.SQUARE)) return new SquareImpl(a);
        if (figure.equals(Figures.RECTANGLE)) return new RectangleImpl(a, a);
        return null;
    }

    public static IGeometry create(double a, double b, Figures figure) {
        if (figure.equals(Figures.SQUARE)) return new SquareImpl(a);
        if (figure.equals(Figures.RECTANGLE)) return new RectangleImpl(a, b);
        return null;
    }
}
