package kry.edu.module1;

public class AboutMe {

    public static void main(String[] args) {

        System.out.println("Facts about me");

        byte myStudyYear = 5;
        System.out.println("I am a " + myStudyYear + " year student");

        // 2^16 = 65000
        short birthday = 1999;
        System.out.println(" I was born on  " + birthday );

        // 2^32 = 2 000 000 000
        int salary = 100_000;
        System.out.println(" I'd like to get " + salary + " a month");

        // long 2^64
        long population = 7_000_000_000L;
        System.out.println("Global population is about " + population
                + " humans");

        // float
        float height = 185.5f;
        System.out.println(" My heght is " + height + "cms.");

        // double 2.4444444444444444444444444
        double weight = 95.5;
        System.out.println(" My weight is " + weight + " kgs");

        // char
        char sign = 'P';
        System.out.println(" the first letter of my sur-name is " + sign);

        // boolean   true/false
        boolean abcd = true;
        System.out.println(" Today it the 1st of March. It is " + abcd);

        String str = "Hello Java";
        System.out.println(str);
    }
}
