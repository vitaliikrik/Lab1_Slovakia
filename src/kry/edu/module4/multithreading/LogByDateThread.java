package kry.edu.module4.multithreading;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  LogByDateThread
  @version  1.0.0 
  @since 4/13/2021 - 11.48
*/
public class LogByDateThread extends Thread {

    private LocalDate logDate;
    private String file;
    private volatile LocalDateTime startOfFirstThread;
    private volatile LocalDateTime finishOfLastThread;

    public LocalDateTime getStartOfFirstThread() {
        return startOfFirstThread;
    }

    public void setStartOfFirstThread(LocalDateTime startOfFirstThread) {
        this.startOfFirstThread = startOfFirstThread;
    }

    public LocalDateTime getFinishOfLastThread() {
        return finishOfLastThread;
    }

    public void setFinishOfLastThread(LocalDateTime finishOfLastThread) {
        this.finishOfLastThread = finishOfLastThread;
    }

    public LogByDateThread(String file, LocalDate logDate) {
        this.file = file;
        this.logDate = logDate;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public LocalDate getLogDate() {
        return logDate;
    }

    public void setLogDate(LocalDate logDate) {
        this.logDate = logDate;
    }

    public void run() {
        LocalDateTime start = LocalDateTime.now();
        if (startOfFirstThread == null) {
            startOfFirstThread = start;
        }
        System.out.println(this.getName() + " has started on " + start);
        try {
            LogService.logsByDateToFile(file, logDate);
        } catch (IOException e) {
            e.printStackTrace();
        }
        LocalDateTime finish = LocalDateTime.now();
        finishOfLastThread = finish;
        System.out.println(this.getName() + " has finished on " + finish);
    }

}
