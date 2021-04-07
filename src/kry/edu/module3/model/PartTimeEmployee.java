package kry.edu.module3.model;

import kry.edu.module3.interfaces.IAccounting;

import java.time.LocalDate;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  PartTimeEmployee
  @version  1.0.0 
  @since 4/5/2021 - 18.55
*/
public class PartTimeEmployee extends Employee implements IAccounting {

    private int numberOfWorkingHoursPerWeek;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(String firstName, String lastName, LocalDate dateOfBirth,
                            String companyName, double ratePerHour,
                            int numberOfWorkingHoursPerWeek) {
        super(firstName, lastName, dateOfBirth, companyName, ratePerHour);
        this.numberOfWorkingHoursPerWeek = numberOfWorkingHoursPerWeek;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                super.toString() +
                ", numberOfWorkingHoursPerWeek=" + numberOfWorkingHoursPerWeek +
                '}';
    }

    @Override
    public double getTotalSalaryForMonth(double numberOfWorkingWeeks) {
        return super.getRatePerHour() * numberOfWorkingHoursPerWeek
                * numberOfWorkingWeeks;
    }
}
