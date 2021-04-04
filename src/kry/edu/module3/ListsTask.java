package kry.edu.module3;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  ListsTask
  @version  1.0.0 
  @since 4/2/2021 - 15.33
*/
public class ListsTask {

    private static final int NUMBER_OF_ELEMENTS_TO_CREATE = 100000;
    private static final int NUMBER_OF_ELEMENTS_TO_WORK_WITH = 1000;
    private static final Random random = new Random();

    private static void createOperation(List<Integer> list, String typeToPrint) {
        LocalDateTime start = LocalDateTime.now();
        for (int i = 0; i < NUMBER_OF_ELEMENTS_TO_CREATE; i++) {
            list.add(random.nextInt(1000));
        }
        LocalDateTime finish = LocalDateTime.now();
        long duration = ChronoUnit.NANOS.between(start, finish);
        if (typeToPrint != null) {
            System.out.println("Duration of " + typeToPrint + " is " + duration);
        }
    }

    private static void insertToTheBeginningOperation(List<Integer> list, String typeToPrint) {
        list.clear();
        createOperation(list, null);
        LocalDateTime start = LocalDateTime.now();
        for (int i = 0; i < NUMBER_OF_ELEMENTS_TO_WORK_WITH; i++) {
            list.add(0, random.nextInt(1000));
        }
        LocalDateTime finish = LocalDateTime.now();
        long duration = ChronoUnit.NANOS.between(start, finish);
        System.out.println("Duration of " + typeToPrint + " is " + duration);
    }

    private static void insertToTheMiddleOperation(List<Integer> list, String typeToPrint) {
        list.clear();
        createOperation(list, null);
        LocalDateTime start = LocalDateTime.now();
        for (int i = 0; i < NUMBER_OF_ELEMENTS_TO_WORK_WITH; i++) {
            list.add(list.size() / 2, random.nextInt(1000));
        }
        LocalDateTime finish = LocalDateTime.now();
        long duration = ChronoUnit.NANOS.between(start, finish);
        System.out.println("Duration of " + typeToPrint + " is " + duration);
    }

    private static void insertToTheEndOperation(List<Integer> list, String typeToPrint) {
        list.clear();
        createOperation(list, null);
        LocalDateTime start = LocalDateTime.now();
        for (int i = 0; i < NUMBER_OF_ELEMENTS_TO_WORK_WITH; i++) {
            list.add(list.size() - 5, random.nextInt(1000));
        }
        LocalDateTime finish = LocalDateTime.now();
        long duration = ChronoUnit.NANOS.between(start, finish);
        System.out.println("Duration of " + typeToPrint + " is " + duration);
    }

    private static void updateOnTheBeginningOperation(List<Integer> list, String typeToPrint) {
        list.clear();
        createOperation(list, null);
        LocalDateTime start = LocalDateTime.now();
        for (int i = 0; i < NUMBER_OF_ELEMENTS_TO_WORK_WITH; i++) {
            list.set(i, random.nextInt(1000));
        }
        LocalDateTime finish = LocalDateTime.now();
        long duration = ChronoUnit.NANOS.between(start, finish);
        System.out.println("Duration of " + typeToPrint + " is " + duration);
    }

    private static void updateOnTheMiddleOperation(List<Integer> list, String typeToPrint) {
        list.clear();
        createOperation(list, null);
        LocalDateTime start = LocalDateTime.now();
        for (int i = list.size() / 2 - NUMBER_OF_ELEMENTS_TO_WORK_WITH / 2;
             i < list.size() / 2 + NUMBER_OF_ELEMENTS_TO_WORK_WITH / 2; i++) {
            list.set(i, random.nextInt(1000));
        }
        LocalDateTime finish = LocalDateTime.now();
        long duration = ChronoUnit.NANOS.between(start, finish);
        System.out.println("Duration of " + typeToPrint + " is " + duration);
    }

    private static void updateOnTheEndOperation(List<Integer> list, String typeToPrint) {
        list.clear();
        createOperation(list, null);
        LocalDateTime start = LocalDateTime.now();
        for (int i = 0; i < NUMBER_OF_ELEMENTS_TO_WORK_WITH; i++) {
            list.set(list.size() - 5, random.nextInt(1000));
        }
        LocalDateTime finish = LocalDateTime.now();
        long duration = ChronoUnit.NANOS.between(start, finish);
        System.out.println("Duration of " + typeToPrint + " is " + duration);
    }

    private static void removeFromTheBeginningOperation(List<Integer> list, String typeToPrint) {
        list.clear();
        createOperation(list, null);
        LocalDateTime start = LocalDateTime.now();
        for (int i = 0; i < NUMBER_OF_ELEMENTS_TO_WORK_WITH; i++) {
            list.remove(0);
        }
        LocalDateTime finish = LocalDateTime.now();
        long duration = ChronoUnit.NANOS.between(start, finish);
        System.out.println("Duration of " + typeToPrint + " is " + duration);
    }

    private static void removeFromTheMiddleOperation(List<Integer> list, String typeToPrint) {
        list.clear();
        createOperation(list, null);
        LocalDateTime start = LocalDateTime.now();
        for (int i = 0; i < NUMBER_OF_ELEMENTS_TO_WORK_WITH; i++) {
            list.remove(list.size() / 2);
        }
        LocalDateTime finish = LocalDateTime.now();
        long duration = ChronoUnit.NANOS.between(start, finish);
        System.out.println("Duration of " + typeToPrint + " is " + duration);
    }

    private static void removeFromTheEndOperation(List<Integer> list, String typeToPrint) {
        list.clear();
        createOperation(list, null);
        LocalDateTime start = LocalDateTime.now();
        for (int i = 0; i < NUMBER_OF_ELEMENTS_TO_WORK_WITH; i++) {
            list.remove(list.size() - 5);
        }
        LocalDateTime finish = LocalDateTime.now();
        long duration = ChronoUnit.NANOS.between(start, finish);
        System.out.println("Duration of " + typeToPrint + " is " + duration);
    }

    private static void getElementsFromTheMiddle(List<Integer> list, String typeToPrint) {
        list.clear();
        createOperation(list, null);
        LocalDateTime start = LocalDateTime.now();
        for (int i = list.size() / 2 - NUMBER_OF_ELEMENTS_TO_WORK_WITH / 2;
             i < list.size() / 2 + NUMBER_OF_ELEMENTS_TO_WORK_WITH / 2; i++) {
            list.get(i);
        }
        LocalDateTime finish = LocalDateTime.now();
        long duration = ChronoUnit.NANOS.between(start, finish);
        System.out.println("Duration of " + typeToPrint + " is " + duration);
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("|Lists creation|");
        createOperation(arrayList, "ArrayList ");
        createOperation(linkedList, "LinkedList");

        System.out.println();
        System.out.println("-------------------------------------------");

        System.out.println("|insert to the beginning operation|");
        insertToTheBeginningOperation(arrayList, "ArrayList ");
        insertToTheBeginningOperation(linkedList, "LinkedList");

        System.out.println();

        System.out.println("|insert to the middle operation|");
        insertToTheMiddleOperation(arrayList, "ArrayList ");
        insertToTheMiddleOperation(linkedList, "LinkedList");

        System.out.println();

        System.out.println("|Insert to the end operation|");
        insertToTheEndOperation(arrayList, "ArrayList ");
        insertToTheEndOperation(linkedList, "LinkedList");

        System.out.println();
        System.out.println("-------------------------------------------");

        System.out.println("|Update on the beginning operation|");
        updateOnTheBeginningOperation(arrayList, "ArrayList ");
        updateOnTheBeginningOperation(linkedList, "LinkedList");

        System.out.println();

        System.out.println("|Update on the middle operation|");
        updateOnTheMiddleOperation(arrayList, "ArrayList ");
        updateOnTheMiddleOperation(linkedList, "LinkedList");

        System.out.println();

        System.out.println("|Update on the end operation|");
        updateOnTheEndOperation(arrayList, "ArrayList ");
        updateOnTheEndOperation(linkedList, "LinkedList");

        System.out.println();
        System.out.println("-------------------------------------------");

        System.out.println("|Remove from the beginning operation|");
        removeFromTheBeginningOperation(arrayList, "ArrayList ");
        removeFromTheBeginningOperation(linkedList, "LinkedList");

        System.out.println();

        System.out.println("|Remove from the middle operation|");
        removeFromTheMiddleOperation(arrayList, "ArrayList ");
        removeFromTheMiddleOperation(linkedList, "LinkedList");

        System.out.println();

        System.out.println("|Remove from the end operation|");
        removeFromTheEndOperation(arrayList, "ArrayList ");
        removeFromTheEndOperation(linkedList, "LinkedList");

        System.out.println();
        System.out.println("-------------------------------------------");

        System.out.println("|Get from the middle operation|");
        getElementsFromTheMiddle(arrayList, "ArrayList ");
        getElementsFromTheMiddle(linkedList, "LinkedList");
    }

    /*
        |Lists creation|
        Duration of ArrayList  is 128000000
        Duration of LinkedList is 6000000

        -------------------------------------------
        |insert to the beginning operation|
        Duration of ArrayList  is 53000000
        Duration of LinkedList is 1000000

        |insert to the middle operation|
        Duration of ArrayList  is 11000000
        Duration of LinkedList is 226000000

        |Insert to the end operation|
        Duration of ArrayList  is 0
        Duration of LinkedList is 0

        -------------------------------------------
        |Update on the beginning operation|
        Duration of ArrayList  is 0
        Duration of LinkedList is 4000000

        |Update on the middle operation|
        Duration of ArrayList  is 0
        Duration of LinkedList is 221000000

        |Update on the end operation|
        Duration of ArrayList  is 0
        Duration of LinkedList is 1000000

        -------------------------------------------
        |Remove from the beginning operation|
        Duration of ArrayList  is 74000000
        Duration of LinkedList is 1000000

        |Remove from the middle operation|
        Duration of ArrayList  is 19000000
        Duration of LinkedList is 301000000

        |Remove from the end operation|
        Duration of ArrayList  is 0
        Duration of LinkedList is 0

        -------------------------------------------
        |Get from the middle operation|
        Duration of ArrayList  is 0
        Duration of LinkedList is 240000000
     */
    /*
        LinkedList is faster than ArrayList while list creation, inserting and
        removing elements performed on the beginning of lists.

        Inserting and removing elements performed on the end of lists are equal
        in both list implementations.

        In the rest of the cases ArrayList implementation is preferable.
     */
}
