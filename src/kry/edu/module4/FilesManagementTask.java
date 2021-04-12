package kry.edu.module4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  FilesManagementTask
  @version  1.0.0 
  @since 4/9/2021 - 18.18
*/
public class FilesManagementTask {

    private static final String ERROR_LOG = "ERROR";
    private static final String LOG_FILE_NAME = "logs.txt";

    public static void main(String[] args) throws IOException {
        LocalDateTime start = LocalDateTime.now();

        String logs = new String(Files.readAllBytes(Paths.get(LOG_FILE_NAME)));
        final String[] lines = logs.split("\n");
        System.out.println("Log file contains " + lines.length + " lines");
        System.out.println("----------------------------------------------");
        System.out.println("Split Function");

        long errorsCount = Arrays.stream(lines)
                .filter(line -> line.contains(ERROR_LOG))
                .count();
        System.out.println("Errors count: " + errorsCount);

        LocalDateTime finish = LocalDateTime.now();
        long splitPerformance = ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Function takes " + splitPerformance + " ms");

        System.out.println("----------------------------------------------");
        System.out.println("Files.lines Function");
        start = LocalDateTime.now();

        errorsCount = Files.lines(Paths.get(LOG_FILE_NAME))
                .filter(line -> line.contains(ERROR_LOG))
                .count();
        System.out.println("Errors count: " + errorsCount);

        finish = LocalDateTime.now();
        long filesLinesPerformance = ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Function takes " + filesLinesPerformance + " ms");

        System.out.println("----------------------------------------------");
        System.out.println("Results comparison");
        if (filesLinesPerformance < splitPerformance) {
            System.out.println("Files.lines function is faster than split function");
        } else if (splitPerformance < filesLinesPerformance) {
            System.out.println("Split function is faster than Files.lines function");
        } else {
            System.out.println("Files.lines function performance is equal to split "
                    + "function performance");
        }
    }
    /*
        Log file contains 2845607 lines
        ----------------------------------------------
        Split Function
        Errors count: 361
        Function takes 7991 ms
        ----------------------------------------------
        Files.lines Function
        Errors count: 361
        Function takes 2042 ms
        ----------------------------------------------
        Results comparison
        Files.lines function is faster than split function
     */
}
