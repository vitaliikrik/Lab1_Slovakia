package kry.edu.module2.inheritance;

import java.time.LocalDate;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  InheritanceStudentMain
  @version  1.0.0 
  @since 3/22/2021 - 11.51
*/
public class InheritanceStudentMain {
    public static void main(String[] args) {
        Student student = new Student("Ivan", "Pupkin", "Alexandrovich",
                "Khrakiv, Pushkinska St. 79/1", LocalDate.of(1999, 1, 1),
                1, true, "ukrainian", "ukrainian", false, "1234567890", 178, 69,
                'M', "black", "NTU KhPI", "KN", "PIITU", "KN-M220", "Software engineering",
                "Master", 1, 85.5, "XA №1234567", false);
        System.out.println(student.toString());
    }
    /*
        Student{Person{firstName='Ivan', lastName='Pupkin', patronymicName='Alexandrovich',
        registrationAddress='Khrakiv, Pushkinska St. 79/1', dateOfBirth=1999-01-01,
        bloodGroup=1, isPositiveRhesusFactor=true, nationality='ukrainian',
        citizenship='ukrainian', isMarried=false, identificationNumber='1234567890',
        height=178.0, weight=69.0, gender=M, hairColor='black'},
        university='NTU KhPI', department='KN', chair='PIITU', group='KN-M220',
        specialty='Software engineering', currentEducationDegree='Master',
        yearOfStudy=1, averageGrade=85.5, studentCardNumber='XA №1234567', isGranted=false}
     */
}
