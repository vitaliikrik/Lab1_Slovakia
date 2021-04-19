package kry.edu.module5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  Task3
  @version  1.0.0 
  @since 4/19/2021 - 19.21
*/
public class Task3 {
    public static boolean hasDuplicates(int[] array) {
        Arrays.sort(array);
        List<Integer> distinctNumbers = Arrays.stream(array)
                .boxed()
                .distinct()
                .collect(Collectors.toList());
        return array.length != distinctNumbers.size();
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 3, 6, 2, 9, 33, 21};
        System.out.println(hasDuplicates(array));  // false
        array[5] = 1;
        System.out.println(hasDuplicates(array)); // true
    }
}
