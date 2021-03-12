package kry.edu.module1;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  IntegralTask
  @version  1.0.0
  @since 3/8/2021 - 19.50
*/
public class IntegralTask {

    public static double getIntegral(Function function,
                                     double start,
                                     double finish,
                                     double steps,
                                     double secant) {
        double step = (finish - start) / steps;
        double area = 0;
        double height;
        for (int i = 1; i <= steps; i++) {
            height = function.getResult(i * step);
            if (height > secant) {
                height = secant;
            }
            double current_area = height * step;
            area += current_area;
        }
        return area;
    }

    public static void main(String[] args) {
        double start = 0;
        double finish = Math.PI;
        double steps = 1000;
        int numberInStudentCard = 1;
        double generalMultiplier = 0.1D;
        System.out.println(getIntegral(Math::sin, start, finish, steps,
                generalMultiplier * numberInStudentCard));
    }
}
