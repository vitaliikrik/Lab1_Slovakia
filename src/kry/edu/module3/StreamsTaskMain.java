package kry.edu.module3;

import kry.edu.module3.interfaces.IAccounting;
import kry.edu.module3.model.FullTimeEmployee;
import kry.edu.module3.model.PartTimeEmployee;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  StreamsTaskMain
  @version  1.0.0 
  @since 4/7/2021 - 15.41
*/
public class StreamsTaskMain {
    public static void main(String[] args) {
        List<IAccounting> accountingList = new ArrayList<>(
                Arrays.asList(
                        new FullTimeEmployee("Peter", "Crouch",
                                LocalDate.of(1994, Month.APRIL, 1), "Company 1", 35),
                        new FullTimeEmployee("Helen", "Norris",
                                LocalDate.of(1992, Month.MARCH, 5), "Company 1", 25),
                        new FullTimeEmployee("Chuck", "Lost",
                                LocalDate.of(1999, Month.OCTOBER, 25), "Company 1", 15),
                        new FullTimeEmployee("Michael", "Scofield",
                                LocalDate.of(1985, Month.DECEMBER, 31), "Company 1", 52),
                        new FullTimeEmployee("Lincoln", "Burrows",
                                LocalDate.of(1986, Month.AUGUST, 21), "Company 1", 43),
                        new PartTimeEmployee("Igor", "Stone",
                                LocalDate.of(1986, Month.JULY, 21), "Company 1", 22, 30),
                        new PartTimeEmployee("Yegor", "Package",
                                LocalDate.of(1987, Month.JANUARY, 28), "Company 1", 20, 25),
                        new PartTimeEmployee("Alina", "Terrain",
                                LocalDate.of(1988, Month.FEBRUARY, 22), "Company 1", 50, 32),
                        new PartTimeEmployee("Maria", "Kovalenko",
                                LocalDate.of(1989, Month.MARCH, 15), "Company 1", 38, 20),
                        new PartTimeEmployee("Elizabeth", "Collins",
                                LocalDate.of(1990, Month.APRIL, 12), "Company 1", 41, 34)
                )
        );

        double numberOfWorkingDaysInMonth = 20;
        double numberOfWorkingWeeksInMonth = numberOfWorkingDaysInMonth / 5;

        double totalMonthlySalarySum = accountingList.stream()
                .mapToDouble(accounting -> accounting.getTotalSalaryForMonth(numberOfWorkingWeeksInMonth))
                .sum();
        IAccounting maxSalaryEmployee = accountingList.stream()
                .max(Comparator.comparing((IAccounting arg) -> arg.getTotalSalaryForMonth(numberOfWorkingWeeksInMonth)))
                .get();
        IAccounting minSalaryEmployee = accountingList.stream()
                .min(Comparator.comparing((IAccounting arg) -> arg.getTotalSalaryForMonth(numberOfWorkingWeeksInMonth)))
                .get();
        double averageMonthlySalary = accountingList.stream()
                .mapToDouble(accounting -> accounting.getTotalSalaryForMonth(numberOfWorkingWeeksInMonth))
                .average()
                .getAsDouble();
        double totalSumPartTimed = accountingList.stream()
                .filter(el -> el instanceof PartTimeEmployee)
                .mapToDouble(accounting -> accounting.getTotalSalaryForMonth(numberOfWorkingWeeksInMonth))
                .sum();
        double totalSumFullTimed = accountingList.stream()
                .filter(el -> el instanceof FullTimeEmployee)
                .mapToDouble(accounting -> accounting.getTotalSalaryForMonth(numberOfWorkingWeeksInMonth))
                .sum();

        System.out.println("Total monthly salary for all the employees: " + totalMonthlySalarySum);
        System.out.println("Max salary employee: " + maxSalaryEmployee + " has salary "
                + maxSalaryEmployee.getTotalSalaryForMonth(numberOfWorkingWeeksInMonth));
        System.out.println("Min salary employee: " + minSalaryEmployee + " has salary "
                + minSalaryEmployee.getTotalSalaryForMonth(numberOfWorkingWeeksInMonth));
        System.out.println("Average monthly salary: " + averageMonthlySalary);

        if (totalSumPartTimed > totalSumFullTimed) {
            System.out.println("Part-time employees get more salary than full-time employees");
        } else if (totalSumPartTimed < totalSumFullTimed) {
            System.out.println("Full-time employees get more salary than part-time employees");
        } else {
            System.out.println("Full-time employees get equal salary than part-time employees");
        }
    }
    /*
    Total monthly salary for all the employees: 46856.0
    Max salary employee: FullTimeEmployee{Employee{Person{firstName='Michael', lastName='Scofield', dateOfBirth=1985-12-31},
                         companyName='Company 1', ratePerHour=52.0}} has salary 8320.0
    Min salary employee: PartTimeEmployee{Employee{Person{firstName='Yegor', lastName='Package', dateOfBirth=1987-01-28},
                         companyName='Company 1', ratePerHour=20.0}, numberOfWorkingHoursPerWeek=25} has salary 2000.0
    Average monthly salary: 4685.6
    Full-time employees get more salary than part-time employees
     */
}
