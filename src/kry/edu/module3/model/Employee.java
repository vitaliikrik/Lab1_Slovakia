package kry.edu.module3.model;

import java.time.LocalDate;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  Employee
  @version  1.0.0 
  @since 4/7/2021 - 15.31
*/
public class Employee extends Person {

    private String companyName;
    private double ratePerHour;

    public Employee() {
    }

    public Employee(String firstName, String lastName, LocalDate dateOfBirth,
                    String companyName, double ratePerHour) {
        super(firstName, lastName, dateOfBirth);
        this.companyName = companyName;
        this.ratePerHour = ratePerHour;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                ", companyName='" + companyName + '\'' +
                ", ratePerHour=" + ratePerHour +
                '}';
    }
}
