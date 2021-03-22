package kry.edu.module2.inheritance;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  InheritanceWallMain
  @version  1.0.0 
  @since 3/22/2021 - 12.43
*/
public class InheritanceWallMain {
    public static void main(String[] args) {
        Wall wall1 = new Wall(10, 10, "white", false, true);
        Wall wall2 = new Wall(20, 20, "white", false, true);
        System.out.println(wall1 + " has price " + wall1.getPrice());
        System.out.println(wall2 + " has price " + wall2.getPrice());
    }
    /*
        Wall{Rectangle{length = 10.0, width = 10.0}, color='white', isInner=false, isWarmed=true} has price 600.0
        Wall{Rectangle{length = 20.0, width = 20.0}, color='white', isInner=false, isWarmed=true} has price 2400.0
     */
}
