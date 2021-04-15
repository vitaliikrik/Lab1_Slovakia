package kry.edu.module4.multithreading;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  MultithreadingTaskMain
  @version  1.0.0 
  @since 4/13/2021 - 11.35
*/
public class MultithreadingTaskMain {
    public static void main(String[] args) throws IOException, InterruptedException {
        LocalDate date = LocalDate.of(2020, Month.FEBRUARY, 14);

        System.out.println(" ---------------------Consistent-----------------");
        LocalDateTime start = LocalDateTime.now();
        System.out.println("Running has started on " + start);
        for (int i = 0; i < 5; i++) {
            LogService.logsByDateToFile("logs.txt", date.plusDays(i));
        }
        LocalDateTime finish = LocalDateTime.now();
        System.out.println("Running has finished on " + finish);
        System.out.println("It took " + ChronoUnit.MILLIS.between(start, finish)
                + " ms");

        System.out.println(" ---------------------Parallel-------------------");
        List<Thread> threads = new ArrayList<>();
        start = LocalDateTime.now();
        System.out.println("Running has started on " + start);
        for (int i = 0; i < 5; i++) {
            Thread thread = new LogByDateThread("logs.txt", date.plusDays(i));
            threads.add(thread);
            thread.start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        finish = LocalDateTime.now();
        System.out.println("Running has finished on " + finish);
        System.out.println("It took " + ChronoUnit.MILLIS.between(start, finish)
                + " ms");
    }
}
