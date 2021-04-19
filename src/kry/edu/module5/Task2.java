package kry.edu.module5;

import java.util.Arrays;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  Task2
  @version  1.0.0 
  @since 4/19/2021 - 19.05
*/
public class Task2 {
    public static int[] rightShift(int[] array, int step) {
        for (int iterations = 0; iterations < step; iterations++) {
            int temp = array[array.length - 1];
            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        System.out.println(Arrays.toString(rightShift(array, 1))); // [30, 10, 20]

        int[] array2 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(rightShift(array2, 2))); // [40, 50, 10, 20, 30]

        System.out.println(Arrays.toString(rightShift(array2, 21))); // [50, 10, 20, 30, 40]
    }
}
