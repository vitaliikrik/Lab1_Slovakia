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
    /*
         ---------------------Consistent-----------------
        Running has started on 2021-04-15T10:31:51.854
        Running has finished on 2021-04-15T10:31:56.918
        It took 5064 ms
         ---------------------Parallel-------------------
        Running has started on 2021-04-15T10:31:56.919
        Thread-0 has started on 2021-04-15T10:31:56.919
        Thread-1 has started on 2021-04-15T10:31:56.919
        Thread-3 has started on 2021-04-15T10:31:56.919
        Thread-2 has started on 2021-04-15T10:31:56.919
        Thread-4 has started on 2021-04-15T10:31:56.919
        Thread-3 has finished on 2021-04-15T10:31:58.684
        Thread-2 has finished on 2021-04-15T10:31:58.710
        Thread-1 has finished on 2021-04-15T10:31:58.733
        Thread-0 has finished on 2021-04-15T10:31:58.806
        Thread-4 has finished on 2021-04-15T10:31:58.824
        Running has finished on 2021-04-15T10:31:58.824
        It took 1905 ms
     */
    /*
        Parallel execution took 1905 ms, consistent execution took 5064 ms.
        That means that parallel execution is faster than consistent one.
     */
}
