package kry.edu.factory;

import kry.edu.factory.implementations.RoundImpl;
import kry.edu.module2.polymorphism.interfaces.IGeometry;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  FactoryMain
  @version  1.0.0 
  @since 3/29/2021 - 19.09
*/
public class FactoryMain {
    public static void main(String[] args) {
        System.out.println("Fabric task: ");
        RoundImpl round = RoundFactory.create(5);
        RoundImpl nullRound = RoundFactory.create(-4);
        System.out.println("Round is " + round);
        System.out.println("Null round is " + nullRound);

        System.out.println("Abstract fabric task: ");
        IGeometry roundImpl = FiguresFactory.create(1, Figures.ROUND);
        IGeometry rectangleImpl = FiguresFactory.create(5, 10, Figures.RECTANGLE);
        IGeometry squareImpl = FiguresFactory.create(5, 5);
        System.out.println("Round: " + roundImpl);
        System.out.println("Rectangle: " + rectangleImpl);
        System.out.println("Square: " + squareImpl);
    }
    /*
        Fabric task:
        Round is Round{radius=5.0}
        Null round is null
        Abstract fabric task:
        Round: Round{radius=1.0}
        Rectangle: Rectangle{length = 5.0, width = 10.0}
        Square: Square{side=5.0}
     */
}
