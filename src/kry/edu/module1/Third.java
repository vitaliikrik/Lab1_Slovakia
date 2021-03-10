package kry.edu.module1;

import java.util.concurrent.Callable;

/*
  @author   Vitalii - Vitalii Krykun
  @project   Lab1_Slovakia
  @class  Third
  @version  1.0.0 
  @since 3/8/2021 - 19.40
*/
public class Third {

    public static double getIntegral(int secant) {
        int start = 0;
        double finish = Math.PI;
        double steps = 1000;
        double step = (finish - start) / steps;
        double area = 0;
        double height;
        for (int i = 1; i <= steps; i++) {
            height = Math.sin(i * step);
            if (height > (0.1D * secant)) {
                height = 0.1D * secant;
            }
            double current_area = height * step;
            area += current_area;
        }
        return area;
    }

    public static void main(String[] args) {
        System.out.println(getIntegral(10));
    }
}
