package kry.edu.module2.polymorphism;

import kry.edu.module2.polymorphism.interfaces.IGeometry;
import kry.edu.module2.polymorphism.interfaces.IPacking;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  PolymorphismTaskMain
  @version  1.0.0 
  @since 3/24/2021 - 19.33
*/
public class PolymorphismTaskMain {
    public static void main(String[] args) {
        double radius = 5;
        Round2 round = new Round2(radius);
        System.out.println("Round is " + round);
        IGeometry geometryRound = round;
        IPacking packingRound = round;
        System.out.println("Perimeter of round is " + geometryRound.getPerimeter());
        System.out.println("Area of round is " + geometryRound.getArea());
        System.out.println("Json view of round is " + packingRound.toJSON());
        System.out.println("XML view of round is " + packingRound.toXML());
    }
    /*
        Round is Round{radius=5.0}
        Perimeter of round is 31.41592653589793
        Area of round is 78.53981633974483
        Json view of round is Round{"radius":5.0}
        XML view of round is <Round><radius>5.0</radius></Round>
     */
}
