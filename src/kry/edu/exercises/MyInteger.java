package kry.edu.exercises;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  MyInteger
  @version  1.0.0 
  @since 3/26/2021 - 19.43
*/
public class MyInteger {

    public static boolean isPrime(int num) {
        if (num <= 0 ) {
            throw new IllegalArgumentException("Number should be positive");
        }
        if (num == 1) {
            return false;
        }
        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 2; i <= 20; i++) {
            System.out.println("Number " + i + " is prime: " + isPrime(i));
        }
    }
    /*
        Number 2 is prime: true
        Number 3 is prime: true
        Number 4 is prime: false
        Number 5 is prime: true
        Number 6 is prime: false
        Number 7 is prime: true
        Number 8 is prime: false
        Number 9 is prime: false
        Number 10 is prime: false
        Number 11 is prime: true
        Number 12 is prime: false
        Number 13 is prime: true
        Number 14 is prime: false
        Number 15 is prime: false
        Number 16 is prime: false
        Number 17 is prime: true
        Number 18 is prime: false
        Number 19 is prime: true
        Number 20 is prime: false
     */
}
