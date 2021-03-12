package kry.edu.module1;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  AboutMeTask
  @version  1.0.0
  @since 3/8/2021 - 19.33
*/
public class AboutMeTask {

    public static void main(String[] args) {
        System.out.println("Facts about me:");

        byte myStudyYear = 5;
        System.out.println("I am a " + myStudyYear + " year student");

        short birthday = 1999;
        System.out.println("I was born in " + birthday);

        int salary = 2_000_000;
        System.out.println("I'd like to live in a " + salary
                + " dollars house");

        long msForTwentyTwoYears = 693_792_000_000L;
        System.out.println("I had lived more than " + msForTwentyTwoYears
                + " ms since my birth");

        float temperature = 36.6F;
        System.out.println("My favorite body temperature is " + temperature
                + " degrees");

        double hotDrinkAverageCups = 5.5714285714D;
        System.out.println("In average I drink " + hotDrinkAverageCups
                + " cups of tea/coffee a day");

        char examNote = 'A';
        System.out.println("My favorite note for exams is " + examNote);

        boolean isFootballFan = true;
        System.out.println("Do I like to watch football? It's " + isFootballFan);
    }
}
