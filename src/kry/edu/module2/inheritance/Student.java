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
                   String citizenship, String maritalStatus, String identificationNumber,
                   double height, double weight, char gender, String hairColor,
                   String university, String department, String chair, String group,
                   String specialty, String currentEducationDegree, int yearOfStudy,
                   double averageGrade, String studentCardNumber, boolean isGranted) {
        super(firstName, lastName, patronymicName, registrationAddress, dateOfBirth,
                bloodGroup, isPositiveRhesusFactor, nationality, citizenship,
                maritalStatus, identificationNumber, height, weight, gender, hairColor);
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
                Double.compare(student.getAverageGrade(), getAverageGrade()) == 0 &&
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

    public static class Builder {
        private Student student;

        public Builder() {
            this.student = new Student();
        }

        public Builder setSimilarTo(Student student) {
            this.student.setFirstName(student.getFirstName());
            this.student.setLastName(student.getLastName());
            this.student.setPatronymicName(student.getPatronymicName());
            this.student.setRegistrationAddress(student.getRegistrationAddress());
            this.student.setDateOfBirth(student.getDateOfBirth());
            this.student.setBloodGroup(student.getBloodGroup());
            this.student.setPositiveRhesusFactor(student.isPositiveRhesusFactor());
            this.student.setNationality(student.getNationality());
            this.student.setCitizenship(student.getCitizenship());
            this.student.setMaritalStatus(student.getMaritalStatus());
            this.student.setIdentificationNumber(student.getIdentificationNumber());
            this.student.setHeight(student.getHeight());
            this.student.setWeight(student.getWeight());
            this.student.setGender(student.getGender());
            this.student.setHairColor(student.getHairColor());
            this.student.setPatronymicName(student.getPatronymicName());
            this.student.setUniversity(student.getUniversity());
            this.student.setDepartment(student.getDepartment());
            this.student.setChair(student.getChair());
            this.student.setGroup(student.getGroup());
            this.student.setSpecialty(student.getSpecialty());
            this.student.setCurrentEducationDegree(student.getCurrentEducationDegree());
            this.student.setYearOfStudy(student.getYearOfStudy());
            this.student.setAverageGrade(student.getAverageGrade());
            this.student.setStudentCardNumber(student.getStudentCardNumber());
            this.student.setGranted(student.isGranted());
            return this;
        }

        public Builder setFirstName(String firstName) {
            student.setFirstName(firstName);
            return this;
        }

        public Builder setLastName(String lastName) {
            student.setLastName(lastName);
            return this;
        }

        public Builder setPatronymicName(String patronymicName) {
            student.setPatronymicName(patronymicName);
            return this;
        }

        public Builder setRegistrationAddress(String registrationAddress) {
            student.setRegistrationAddress(registrationAddress);
            return this;
        }

        public Builder setDateOfBirth(LocalDate dateOfBirth) {
            student.setDateOfBirth(dateOfBirth);
            return this;
        }

        public Builder setBloodGroup(int bloodGroup) {
            student.setBloodGroup(bloodGroup);
            return this;
        }

        public Builder setPositiveRhesusFactor(boolean positiveRhesusFactor) {
            student.setPositiveRhesusFactor(positiveRhesusFactor);
            return this;
        }

        public Builder setNationality(String nationality) {
            student.setNationality(nationality);
            return this;
        }

        public Builder setCitizenship(String citizenship) {
            student.setCitizenship(citizenship);
            return this;
        }

        public Builder setMaritalStatus(String maritalStatus) {
            student.setMaritalStatus(maritalStatus);
            return this;
        }

        public Builder setIdentificationNumber(String identificationNumber) {
            student.setIdentificationNumber(identificationNumber);
            return this;
        }

        public Builder setHeight(int height) {
            student.setHeight(height);
            return this;
        }

        public Builder setWeight(int weight) {
            student.setWeight(weight);
            return this;
        }

        public Builder setGender(char gender) {
            student.setGender(gender);
            return this;
        }

        public Builder setHairColor(String hairColor) {
            student.setHairColor(hairColor);
            return this;
        }

        public Builder setUniversity(String university) {
            student.setUniversity(university);
            return this;
        }

        public Builder setDepartment(String department) {
            student.setDepartment(department);
            return this;
        }

        public Builder setChair(String chair) {
            student.setChair(chair);
            return this;
        }

        public Builder setGroup(String group) {
            student.setGroup(group);
            return this;
        }

        public Builder setSpecialty(String specialty) {
            student.setSpecialty(specialty);
            return this;
        }

        public Builder setCurrentEducationDegree(String currentEducationDegree) {
            student.setCurrentEducationDegree(currentEducationDegree);
            return this;
        }

        public Builder setYearOfStudy(int yearOfStudy) {
            student.setYearOfStudy(yearOfStudy);
            return this;
        }

        public Builder setAverageGrade(double averageGrade) {
            student.setAverageGrade(averageGrade);
            return this;
        }

        public Builder setStudentCardNumber(String studentCardNumber) {
            student.setStudentCardNumber(studentCardNumber);
            return this;
        }

        public Builder setGranted(boolean granted) {
            student.setGranted(granted);
            return this;
        }

        public Student build() {
            return student;
        }
    }
}
