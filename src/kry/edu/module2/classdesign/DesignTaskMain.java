package kry.edu.module2.classdesign;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  DesignTaskMain
  @version  1.0.0 
  @since 3/21/2021 - 12.54
*/
public class DesignTaskMain {

    public static void main(String[] args) {
        double radius = 5;
        System.out.println("Radius of round is " + radius);
        Round round = new Round(radius);
        System.out.println("Diameter of round is " + round.getDiameter());
        System.out.println("Perimeter of round is " + round.getPerimeter());
        System.out.println("Area of round is " + round.getArea());
        double arcAngle = Math.PI / 2;
        double sectorArea = round.getSectorArea(arcAngle);
        System.out.println("Sector area with arc angle " + arcAngle + " is "
                + sectorArea);
        System.out.println("Arc angle with sector area " + sectorArea + " is "
                + round.getArcAngle(sectorArea));
    }
    /*
        Radius of round is 5.0
        Diameter of round is 10.0
        Perimeter of round is 31.41592653589793
        Area of round is 78.53981633974483
        Sector area with arc angle 1.5707963267948966 is 19.634954084936208
        Arc angle with sector area 19.634954084936208 is 1.5707963267948966
     */
}

