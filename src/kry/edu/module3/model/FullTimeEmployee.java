package kry.edu.module3.model;

import kry.edu.module3.interfaces.IAccounting;

import java.time.LocalDate;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  FullTimeEmployee
  @version  1.0.0 
  @since 4/5/2021 - 18.55
*/
public class FullTimeEmployee extends Employee implements IAccounting {

    private static final int DEFAULT_NUMBER_OF_WORKING_HOURS_PER_WEEK = 40;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String firstName, String lastName, LocalDate dateOfBirth,
                            String companyName, double ratePerHour) {
        super(firstName, lastName, dateOfBirth, companyName, ratePerHour);
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                super.toString() +
                "}";
    }

    @Override
    public double getTotalSalaryForMonth(double numberOfWorkingWeeks) {
        return super.getRatePerHour() * DEFAULT_NUMBER_OF_WORKING_HOURS_PER_WEEK
                * numberOfWorkingWeeks;
    }
}
