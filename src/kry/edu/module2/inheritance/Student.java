package kry.edu.module2.inheritance;

import java.time.LocalDate;
import java.util.Objects;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  Student
  @version  1.0.0 
  @since 3/19/2021 - 18.35
*/
public class Student extends Person {
    private String university;
    private String department;
    private String chair;
    private String group;
    private String specialty;
    private String currentEducationDegree; //Could be Bachelor, Master, etc.
    private int yearOfStudy;
    private double averageGrade;
    private String studentCardNumber;
    private boolean isGranted;

    public Student() {
    }

    public Student(String university, String department, String chair, String group,
                   String specialty, String currentEducationDegree, int yearOfStudy,
                   double averageGrade, String studentCardNumber, boolean isGranted) {
        this.university = university;
        this.department = department;
        this.chair = chair;
        this.group = group;
        this.specialty = specialty;
        this.currentEducationDegree = currentEducationDegree;
        this.yearOfStudy = yearOfStudy;
        this.averageGrade = averageGrade;
        this.studentCardNumber = studentCardNumber;
        this.isGranted = isGranted;
    }

    public Student(String firstName, String lastName, String patronymicName,
                   String registrationAddress, LocalDate dateOfBirth, int bloodGroup,
                   boolean isPositiveRhesusFactor, String nationality,
                   String citizenship, boolean isMarried, String identificationNumber,
                   double height, double weight, char gender, String hairColor,
                   String university, String department, String chair, String group,
                   String specialty, String currentEducationDegree, int yearOfStudy,
                   double averageGrade, String studentCardNumber, boolean isGranted) {
        super(firstName, lastName, patronymicName, registrationAddress, dateOfBirth,
                bloodGroup, isPositiveRhesusFactor, nationality, citizenship,
                isMarried, identificationNumber, height, weight, gender, hairColor);
        this.university = university;
        this.department = department;
        this.chair = chair;
        this.group = group;
        this.specialty = specialty;
        this.currentEducationDegree = currentEducationDegree;
        this.yearOfStudy = yearOfStudy;
        this.averageGrade = averageGrade;
        this.studentCardNumber = studentCardNumber;
        this.isGranted = isGranted;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getCurrentEducationDegree() {
        return currentEducationDegree;
    }

    public void setCurrentEducationDegree(String currentEducationDegree) {
        this.currentEducationDegree = currentEducationDegree;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public String getStudentCardNumber() {
        return studentCardNumber;
    }

    public void setStudentCardNumber(String studentCardNumber) {
        this.studentCardNumber = studentCardNumber;
    }

    public boolean isGranted() {
        return isGranted;
    }

    public void setGranted(boolean granted) {
        isGranted = granted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return getYearOfStudy() == student.getYearOfStudy() &&
                isGranted() == student.isGranted() &&
                getUniversity().equals(student.getUniversity()) &&
                getDepartment().equals(student.getDepartment()) &&
                getChair().equals(student.getChair()) &&
                getGroup().equals(student.getGroup()) &&
                getSpecialty().equals(student.getSpecialty()) &&
                getCurrentEducationDegree().equals(student.getCurrentEducationDegree()) &&
                getStudentCardNumber().equals(student.getStudentCardNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getUniversity(), getDepartment(),
                getChair(), getGroup(), getSpecialty(), getCurrentEducationDegree(),
                getYearOfStudy(), getAverageGrade(), getStudentCardNumber(), isGranted());
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                ", university='" + university + '\'' +
                ", department='" + department + '\'' +
                ", chair='" + chair + '\'' +
                ", group='" + group + '\'' +
                ", specialty='" + specialty + '\'' +
                ", currentEducationDegree='" + currentEducationDegree + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", averageGrade=" + averageGrade +
                ", studentCardNumber='" + studentCardNumber + '\'' +
                ", isGranted=" + isGranted +
                '}';
    }
}
