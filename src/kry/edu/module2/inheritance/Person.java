package kry.edu.module2.inheritance;

import java.time.LocalDate;
import java.util.Objects;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  Person
  @version  1.0.0 
  @since 3/19/2021 - 18.34
*/
public class Person {
    private String firstName;
    private String lastName;
    private String patronymicName;
    private String registrationAddress;
    private LocalDate dateOfBirth;
    private int bloodGroup;
    private boolean isPositiveRhesusFactor;
    private String nationality;
    private String citizenship;
    private boolean isMarried;
    private String identificationNumber;
    private double height;
    private double weight;
    private char gender;//M - male, F - female, etc.
    private String hairColor;

    public Person() {
    }

    public Person(String firstName, String lastName, String patronymicName,
                  String registrationAddress, LocalDate dateOfBirth, int bloodGroup,
                  boolean isPositiveRhesusFactor, String nationality,
                  String citizenship, boolean isMarried, String identificationNumber,
                  double height, double weight, char gender, String hairColor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymicName = patronymicName;
        this.registrationAddress = registrationAddress;
        this.dateOfBirth = dateOfBirth;
        this.bloodGroup = bloodGroup;
        this.isPositiveRhesusFactor = isPositiveRhesusFactor;
        this.nationality = nationality;
        this.citizenship = citizenship;
        this.isMarried = isMarried;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.hairColor = hairColor;
        setIdentificationNumber(identificationNumber);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public String getRegistrationAddress() {
        return registrationAddress;
    }

    public void setRegistrationAddress(String registrationAddress) {
        this.registrationAddress = registrationAddress;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(int bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public boolean isPositiveRhesusFactor() {
        return isPositiveRhesusFactor;
    }

    public void setPositiveRhesusFactor(boolean positiveRhesusFactor) {
        isPositiveRhesusFactor = positiveRhesusFactor;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        if (identificationNumber != null && identificationNumber.length() != 10) {
            throw new IllegalArgumentException("ID number must be 10 symbols");
        }
        this.identificationNumber = identificationNumber;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getBloodGroup() == person.getBloodGroup() &&
                isPositiveRhesusFactor() == person.isPositiveRhesusFactor() &&
                isMarried() == person.isMarried() &&
                Double.compare(person.getHeight(), getHeight()) == 0 &&
                Double.compare(person.getWeight(), getWeight()) == 0 &&
                getGender() == person.getGender() &&
                getFirstName().equals(person.getFirstName()) &&
                getLastName().equals(person.getLastName()) &&
                Objects.equals(getPatronymicName(), person.getPatronymicName()) &&
                getRegistrationAddress().equals(person.getRegistrationAddress()) &&
                getDateOfBirth().equals(person.getDateOfBirth()) &&
                getNationality().equals(person.getNationality()) &&
                getCitizenship().equals(person.getCitizenship()) &&
                Objects.equals(getIdentificationNumber(), person.getIdentificationNumber()) &&
                getHairColor().equals(person.getHairColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getPatronymicName(),
                getRegistrationAddress(), getDateOfBirth(), getBloodGroup(),
                isPositiveRhesusFactor(), getNationality(), getCitizenship(),
                isMarried(), getIdentificationNumber(), getHeight(), getWeight(),
                getGender(), getHairColor());
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymicName='" + patronymicName + '\'' +
                ", registrationAddress='" + registrationAddress + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", bloodGroup=" + bloodGroup +
                ", isPositiveRhesusFactor=" + isPositiveRhesusFactor +
                ", nationality='" + nationality + '\'' +
                ", citizenship='" + citizenship + '\'' +
                ", isMarried=" + isMarried +
                ", identificationNumber='" + identificationNumber + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", gender=" + gender +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }
}
