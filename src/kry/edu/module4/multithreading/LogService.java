package kry.edu.module4.multithreading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  LogService
  @version  1.0.0 
  @since 4/13/2021 - 11.35
*/
public class LogService {

    private static final String ERROR_LOG = "ERROR";
    private static final String LOG_EXT = ".log";

    public static List<String> logsByDate(String file, LocalDate date) throws IOException {
        return Files.lines(Paths.get(file))
                .filter(log -> log.contains(date.toString()))
                .collect(Collectors.toList());
    }

    public static void logsByDateToFile(String file, LocalDate date) throws IOException {
        String dateAsString = date.toString();
        String str = "";
        StringBuilder sb = new StringBuilder(str);
        Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsString))
                .filter(log -> log.contains(ERROR_LOG))
                .forEach(log -> sb.append(log).append('\n'));

        String fileOutput = ERROR_LOG + dateAsString + LOG_EXT;
        Files.write(Paths.get(fileOutput), sb.toString().getBytes());
    }
}
