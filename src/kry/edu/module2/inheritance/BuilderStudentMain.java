package kry.edu.module2.inheritance;

import java.time.LocalDate;
import java.time.Month;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  BuildetStudentMain
  @version  1.0.0 
  @since 3/29/2021 - 18.17
*/
public class BuilderStudentMain {
    public static void main(String[] args) {
        Student studentBuilt = new Student.Builder()
                .setFirstName("Anna")
                .setLastName("Kovalenko")
                .setPatronymicName("Andreevna")
                .setRegistrationAddress("Kharkiv, Sumska St 20")
                .setDateOfBirth(LocalDate.of(2000, Month.APRIL, 23))
                .setBloodGroup(2)
                .setPositiveRhesusFactor(false)
                .setNationality("ukrainian")
                .setCitizenship("ukrainian")
                .setMaritalStatus("Single")
                .setIdentificationNumber("0987654321")
                .setHeight(165)
                .setWeight(51)
                .setGender('F')
                .setHairColor("white")
                .setUniversity("NTU KhPI")
                .setDepartment("KN")
                .setChair("PIITU")
                .setGroup("KN-271")
                .setSpecialty("Software engineering")
                .setCurrentEducationDegree("Bachelor")
                .setYearOfStudy(4)
                .setAverageGrade(80.4)
                .setStudentCardNumber("XA №7654321")
                .setGranted(true)
                .build();
        Student studentCopied = new Student.Builder()
                .setSimilarTo(studentBuilt)
                .setFirstName("Inna")
                .setLastName("Minova")
                .setIdentificationNumber("1111111111")
                .setStudentCardNumber("XA №1111111")
                .build();
        System.out.println(studentBuilt);
        System.out.println(studentCopied);
    }
    /*
        Student{Person{firstName='Anna', lastName='Kovalenko', patronymicName='Andreevna',
        registrationAddress='Kharkiv, Sumska St 20', dateOfBirth=2000-04-23, bloodGroup=2,
        isPositiveRhesusFactor=false, nationality='ukrainian', citizenship='ukrainian',
        maritalStatus=Single, identificationNumber='0987654321', height=165.0, weight=51.0,
        gender=F, hairColor='white'}, university='NTU KhPI', department='KN', chair='PIITU',
        group='KN-271', specialty='Software engineering', currentEducationDegree='Bachelor',
        yearOfStudy=4, averageGrade=80.4, studentCardNumber='XA №7654321', isGranted=true}

        Student{Person{firstName='Inna', lastName='Minova', patronymicName='Andreevna',
        registrationAddress='Kharkiv, Sumska St 20', dateOfBirth=2000-04-23, bloodGroup=2,
        isPositiveRhesusFactor=false, nationality='ukrainian', citizenship='ukrainian',
        maritalStatus=Single, identificationNumber='1111111111', height=165.0, weight=51.0,
        gender=F, hairColor='white'}, university='NTU KhPI', department='KN', chair='PIITU',
        group='KN-271', specialty='Software engineering', currentEducationDegree='Bachelor',
        yearOfStudy=4, averageGrade=80.4, studentCardNumber='XA №1111111', isGranted=true}
     */
}
